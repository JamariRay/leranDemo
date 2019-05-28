package com.example.demo.transactional.service.impl;

import com.example.demo.transactional.mapper.PersonMapper;
import com.example.demo.transactional.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tuxiaolei
 * @create 2019/5/28
 */
@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {
    PersonMapper personMapper;
    @Override
    @Transactional
    public void insert(){
        personMapper.insert(1,"huawei");
        personMapper.insert(2,null);
    }
}
