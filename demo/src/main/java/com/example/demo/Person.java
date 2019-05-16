package com.example.demo;/**
 * @author JasonZeng
 * @E-mail: 1103022627@qq.com
 * @DESCRIPTION:
 * @since 2019/5/16 12:32
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author tuxiaolei
 * @create 2019/5/16
 */
@Data
public class Person implements Serializable {
    private Integer id;
    private String name;
}
