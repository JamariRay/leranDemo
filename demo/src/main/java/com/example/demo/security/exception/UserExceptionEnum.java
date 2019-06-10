package com.example.demo.security.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  自定义用户错误异常
 * @author tuxiaolei
 * @create 2019/5/29
 */
@Getter
@AllArgsConstructor
public enum UserExceptionEnum {
    /**
     *  用户查询 结果不存在
     */
    USER_NOT_EXIST(600,"用户不存在"),
    /**
     *  用户登录 账户名或者密码错误
     */
    USER_NAME_PASSWORD_ERROR(601,"用户名密码错误"),
    /**
     *  账户已经存在
     */
    USER_IS_EXIST(602,"账户已存在"),
    /**
     *  用户登录进来 将其他端踢下线 下线账户提示
     */
    USER_IS_LOGIN(603,"您已经在另外一台设备上登录，如非本人操作，请及时登录更改密码");
    private Integer code;
    private String message;


}
