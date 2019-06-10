package com.example.demo.mq.commen;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author tuxiaolei
 * @create 2019/6/10
 */
public class RabbitMqConnectionFactory {
    private static Connection connection;
    public static Connection getRabbitMQConnection(){
        ConnectionFactory factory = new ConnectionFactory();

        try {
            connection = factory.newConnection();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return connection;
    }
    public static void closeConnection(){
        try {
            connection.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

}
