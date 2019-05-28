package com.example.demo;/**
 * @author JasonZeng
 * @E-mail: 1103022627@qq.com
 * @DESCRIPTION:
 * @since 2019/5/20 17:24
 */

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tuxiaolei
 * @create 2019/5/20
 */
public class BigDecimalTest {
    @Test
    public void t(){
        Map<Integer,Student> map = new HashMap<>();
        int size = map.size();
        System.out.println(size);
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal negate = zero.negate();
        BigDecimal a = new BigDecimal(-11);
        int i = zero.compareTo(a);
        //System.out.println("sb:"+i);
        //System.out.println("abs:"+a.abs());
       // BigDecimal add = zero.add(a);
        //BigDecimal subtract = zero.subtract(a);
        //System.out.println(negate);
        //System.out.println(add);
       // System.out.println(subtract);

        List<Integer> list = new ArrayList();
        list.add(0);
        list.add(2);
        list.add(1,1);
        System.out.println(list.toString());
    }

}
