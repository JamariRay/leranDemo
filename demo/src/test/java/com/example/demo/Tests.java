package com.example.demo;/**
 * @author JasonZeng
 * @E-mail: 1103022627@qq.com
 * @DESCRIPTION:
 * @since 2019/5/16 13:15
 */

import com.example.demo.mapper.PersonMapper;
import com.example.demo.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tuxiaolei
 * @create 2019/5/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private PersonMapper personMapper;

    public Tests() {
    }

    @Test
    @Transactional(rollbackFor = Exception.class)
    public void t()  {

        studentMapper.insert(5, "huahua");
        t2();
    }

    @Transactional(rollbackFor = Exception.class)
    public void t2() throws RuntimeException{
            studentMapper.insert(6, "lili");
            t3();

    }
   @Transactional(rollbackFor = Exception.class)
    public void t3() throws RuntimeException{
            studentMapper.insert(7, "haha");

    }
    @Transactional(rollbackFor = Exception.class)
    public void t4() {

            studentMapper.insert(8, null);

    }


}