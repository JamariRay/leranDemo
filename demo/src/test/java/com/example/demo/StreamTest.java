package com.example.demo;

import com.example.demo.entity.Apple;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author tuxiaolei
 * @create 2019/7/19
 */
public class StreamTest {

    @Test
    public void testStream(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered.toString());
    }
    @Test
    public void testFilter(){
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }
    @Test
    public void testCollectors(){
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
    }
    @Test
    public void testObjectCount(){

        List<Apple> appleList = new ArrayList<>();//存放apple对象集合
        Apple apple1 = new Apple(1,"苹果1",new BigDecimal("3.25"),10);
        Apple apple12 = new Apple(1,"苹果2",new BigDecimal("1.35"),20);
        Apple apple2 = new Apple(2,"香蕉",new BigDecimal("2.89"),30);
        Apple apple3 = new Apple(3,"荔枝",new BigDecimal("9.99"),40);
        Apple a = new Apple();
        appleList.add(apple1);
        appleList.add(apple12);
        appleList.add(apple2);
        appleList.add(apple3);
        System.out.println(a.toString());
    }
    @Test
    public void testLinkedHashMapStream(){
        Map<Integer,Integer> map = new HashMap<>(10);
        for(int i =0;i<100;i++){
            map.put(i,i);
        }
        List<Integer> collect = map.values().parallelStream().collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public  void testMapCopy(){
        Map<Integer,Integer> map = new LinkedHashMap<>(10);
        for(int i =0;i<10;i++){
            map.put(i,i);
        }

        Map<Integer,Integer> map2 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue()));
        for(int i=0;i<10;i=i+2){
            int c = i+2;
            map2.put(i,c);
        }
        Map<Integer,Integer> map3 = new LinkedHashMap<>(10);
        map3.putAll(map);
        map3.put(10,10);
        System.out.println("Map2:"+map3);
        System.out.println(map);
    }
     @Test
    public void testSpeed()
     {
         Map<Integer,Integer> map =null;
        /* for(int i =0;i<200;i++){
             map.put(i,i);
         }*/
         Map<Integer,Integer> map2 = new HashMap<>(10);
         for(int i =0;i<200;i++){
         map2.put(i,i);
       }
         map.putAll(map2);

         long startTime=System.currentTimeMillis();
         Optional.ofNullable(map).orElse(map2).forEach((k,v) ->{
             System.out.println("k:"+k+"--------------"+"v:"+v);
         });
     }

}
