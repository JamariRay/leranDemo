package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author tuxiaolei
 * @create 2019/6/5
 */


public class MapTest {

    @Test
    public void t(){
        Map<Integer,Integer> map = new HashMap<>(6);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer value = next.getValue();
            System.out.println(value);
        }
        System.out.println(map.toString());
    }


}
