package com.example.demo.security.controller;

import com.example.demo.security.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tuxiaolei
 * @create 2019/5/29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping
    public User create(){
       return null;
    }
}
