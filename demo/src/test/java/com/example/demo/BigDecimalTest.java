package com.example.demo;/**
 * @author JasonZeng
 * @E-mail: 1103022627@qq.com
 * @DESCRIPTION:
 * @since 2019/5/20 17:24
 */

import com.example.demo.security.entity.User;
import com.example.demo.security.entity.UserSon;
import com.example.demo.transactional.entity.Student;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        Map<Integer, Student> map = new HashMap<>();
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
    @Test
    public void t2(){
        User user = new User();
        BigDecimal amt = user.getAmt();
        System.out.println(amt);
        amt = BigDecimal.ZERO;
        System.out.println(user.toString());
    }
    @Test
    public void t3(){
        UserSon user = new UserSon();
        user.setId(1);
        user.setAmt(BigDecimal.valueOf(100L));
        t4(user);
    }

    private void t4(User user){
        System.out.println(user.getAmt());
        System.out.println(user.toString());
    }
    @Test
    public void t5(){

        BigDecimal money = new BigDecimal(-500.6);
        if (new BigDecimal(money.intValue()).compareTo(money)!=0) {
          money = money.setScale(1,BigDecimal.ROUND_HALF_UP);
        }
        System.out.println(money);
    }
    @Test
    public void t6(){
        BigDecimal a = new BigDecimal(20020.45);
        BigDecimal b = new BigDecimal(129456.45);
        BigDecimal c = new BigDecimal(59459);
        BigDecimal d = new BigDecimal(10007);
        BigDecimal d1 = new BigDecimal(25935);
        BigDecimal d2 = new BigDecimal(14055);
        BigDecimal e =a.divide(b,2, RoundingMode.HALF_UP);
        BigDecimal f =c.divide(b,2, RoundingMode.HALF_UP);
        BigDecimal g =d.divide(b,2, RoundingMode.HALF_UP);
        BigDecimal g1 =d1.divide(b,2, RoundingMode.HALF_UP);
        BigDecimal g2 =d2.divide(b,2, RoundingMode.HALF_UP);
        BigDecimal temp =BigDecimal.ZERO;
        temp=temp.add(e);
        temp=temp.add(f);
        temp=temp.add(g);
        temp=temp.add(g1);
        temp=temp.add(g2);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(temp);
    }

    @Test
    public void test9(){
        BigDecimal a = new BigDecimal(20020.00);
        BigDecimal b = new BigDecimal(129456.00);
        System.out.println(a.add(b));
    }


}
