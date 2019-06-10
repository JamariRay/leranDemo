package com.example.demo.security.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author tuxiaolei
 * @create 2019/5/29
 */
@Data
@EqualsAndHashCode
public class User {
    private BigDecimal amt;
}
