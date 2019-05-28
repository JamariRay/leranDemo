package com.example.demo;

import com.example.demo.transactional.service.StudentService;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tuxiaolei
 * @create 2019/5/28
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionalTest {
    @Autowired
    private StudentService studentService;
    @Test
    public void insert() {
        try {
            // 调用接口的insert()方法
            studentService.insert();
        }catch (Exception e) {
            // 捕捉异常不做处理
        }
    }
    @Test
    public void  delete(){
        try {
            // 调用接口的insert()方法
            studentService.delete();
        }catch (Exception e) {
            // 捕捉异常不做处理
        }
    }

}
