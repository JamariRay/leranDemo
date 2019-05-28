package com.example.demo;

import com.example.demo.transactional.mapper.PersonMapper;
import com.example.demo.transactional.mapper.StudentMapper;
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
