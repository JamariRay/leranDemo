package com.example.demo.mq.commen;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @author tuxiaolei
 * @create 2019/6/10
 */
public class Publisher {
    public static void main(String[] args) {
        publisher();
        consumer();

    }
    public static void publisher() {
        Connection connection = RabbitMqConnectionFactory.getRabbitMQConnection();
        if (connection != null) {
            try {
                // 1.创建信道
                Channel channel = connection.createChannel();
                System.out.println(channel.toString());
                // 2.声明队列 参数一 队列名称 2 是否持久化 3.是否独占模式 4.消费者断开连接后是否删除队列 5.消息其他参数
                channel.queueDeclare("he", false, false, false, null);
                String s = " hello rabbitmq！" + LocalDateTime.now();
                // 3. 发送消息 参数1：交换机名称 2： 队列名称 3： 消息其他属性 4 消息主体 "" 默认direct 交换器 用队列的名称当路由建
                channel.basicPublish("", "he", null, s.getBytes("UTF-8"));
                System.out.println("消息：" + s);
                // 4关闭连接
                channel.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
        public static  void consumer() {
            Connection connection = RabbitMqConnectionFactory.getRabbitMQConnection();
            if (connection != null) {
                try {
                    // 1.创建信道
                    Channel channel = connection.createChannel();
                    // 2.声明队列 参数一 队列名称 2 是否持久化 3.是否独占模式 4.消费者断开连接后是否删除队列 5.消息其他参数
                    channel.queueDeclare("he", false, false, false, null);
                    // 3. 创建订阅器 并接受消息
                    channel.basicConsume("he", false, "", new DefaultConsumer(channel) {
                        @Override
                        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                            String routingKey = envelope.getRoutingKey();
                            System.out.println("路由键：" + routingKey);
                            String contentType = properties.getContentType();
                            System.out.println(contentType);
                            String content = new String(body, "UTF-8");
                            System.out.println("消费消息：" + content);
                            //  手动确认消息 参数一 该消息的index 参数二是否批量应答 true 批确认小于index的消息
                            channel.basicAck(envelope.getDeliveryTag(), false);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
}


