package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author tuxiaolei
 * @create 2019/7/19
 */
@Data
@EqualsAndHashCode
public class Apple {
    private Integer id;

    private String name;

    private BigDecimal money;

    private Integer num;

    public Apple(Integer id, String name, BigDecimal money, Integer num) {

        this.id = id;

        this.name = name;

        this.money = money;

        this.num = num;

    }

    public Apple() {
        this.id = 0;

        this.name = "二狗";

        this.money = BigDecimal.TEN;

        this.num = 0;
    }
}
