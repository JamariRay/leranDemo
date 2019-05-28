package com.example.demo.transactional.service;

import com.example.demo.Student;
import com.example.demo.transactional.MyException;

/**
 * @author tuxiaolei
 * @create 2019/5/28
 */
public interface StudentService {

    void insert() throws Exception;
    void delete() throws Exception;
}
