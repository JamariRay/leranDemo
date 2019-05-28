package com.example.demo.transactional;

/**
 * @author tuxiaolei
 * @create 2019/5/28
 */
public class MyException extends Exception{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}
