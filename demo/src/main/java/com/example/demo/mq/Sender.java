package com.example.demo.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author tuxiaolei
 * @create 2019/6/4
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello"+ LocalDate.now();
        this.amqpTemplate.convertAndSend("hello",context);
    }

}
