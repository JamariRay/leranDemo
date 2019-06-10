package com.example.demo.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @author tuxiaolei
 * @create 2019/6/4
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);
    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver : "+hello);
    }

}
