package com.example.demo.transactional.service.impl;

import com.example.demo.Person;
import com.example.demo.Student;
import com.example.demo.transactional.MyException;
import com.example.demo.transactional.mapper.PersonMapper;
import com.example.demo.transactional.mapper.StudentMapper;
import com.example.demo.transactional.service.PersonService;
import com.example.demo.transactional.service.StudentService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;

/**
 * @author tuxiaolei
 * @create 2019/5/28
 */
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentMapper studentMapper;
    private PersonService personService;
    private static Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Override
    @Transactional
    public void insert() throws Exception{
        logger.info("测试开始");
            studentMapper.insert(1, "华为");
            studentMapper.insert(2, "苹果");
       // ((StudentService)AopContext.currentProxy()).delete();
        delete();
        // $stuentService.delete

    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete()  throws Exception{
            try {
               personService.insert();
                studentMapper.insert(4, null);
            }catch(Exception e){
                throw  new Exception();
            }

}
    /**
     *  java zhu jie
     */
}
