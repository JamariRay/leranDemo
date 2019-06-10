package com.example.demo;

import com.example.demo.mq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tuxiaolei
 * @create 2019/6/4
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception{
        sender.send();
    }
}
