package com.example.demo.config;

import com.example.demo.mq.commen.RabbitMqConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.integration.redis.util.RedisLockRegistry;

/**
 * @author tuxiaolei
 * @create 2019/7/23
 */
@Configuration
public class RedisLockConfiguration {

    @Bean
    public RedisLockRegistry redisLockRegistry(RedisConnectionFactory redisConnectionFactory){
        return new RedisLockRegistry(redisConnectionFactory,"hello");
    }
}
