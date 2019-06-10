package com.example.demo.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author tuxiaolei
 * @create 2019/6/4
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){
       return new Queue("hello");
    }
}
