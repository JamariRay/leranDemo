package com.example.demo;/**
 * @author JasonZeng
 * @E-mail: 1103022627@qq.com
 * @DESCRIPTION:
 * @since 2019/5/16 12:29
 */

import com.example.demo.mapper.PersonMapper;
import com.example.demo.mapper.StudentMapper;
import lombok.AllArgsConstructor;

/**
 * @author tuxiaolei
 * @create 2019/5/16
 */
@AllArgsConstructor
public class Test {
      private StudentMapper studentMapper;
      private PersonMapper personMapper;


    public void test() {

        studentMapper.insert(1,"huahua");
        studentMapper.insert(2,"lala");
        personMapper.insert(1,"lala");
        personMapper.insert(2,null);
    }
}
