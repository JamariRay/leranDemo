package com.example.demo;/**
 * @author JasonZeng
 * @E-mail: 1103022627@qq.com
 * @DESCRIPTION:
 * @since 2019/5/18 16:29
 */

import com.example.demo.hash.StringHash;
import org.junit.Test;

/**
 * @author tuxiaolei
 * @create 2019/5/18
 */
public class HashTest {
    @Test
    public void t(){
        String s = "CS001";
        String s1 = "CS002";
        String s2 = "CS003";
        String s3 = "CS004";
        String s4 = "CS005";
        String s5 = "CS006";

        int i = s.hashCode();
        int i2 = s1.hashCode();
        int i3 = s2.hashCode();
        int i4 = s3.hashCode();
        int i5 = s4.hashCode();
        int i6= s5.hashCode();
        int a = i%5;
        int a2 = i2%5;
        int a3 = i3%5;
        int a4 = i4%5;
        int a5 = i5%5;
        int a6 = i6%5;

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

    }

}
