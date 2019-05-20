package com.example.demo.thread;


/**
 * @author tuxiaolei
 * @create 2019/5/17
 */
public class LockDemo {
    /**
     * 死锁产生的原因 1 多个线程等待对方释放锁
     * @param args
     */
    public static void main(String[] args) {
            // 线程a
            Thread td1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    LockDemo.method1();
                }
            });
            // 线程b
            Thread td2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    LockDemo.method2();
                }
            });

            td1.start();
            td2.start();
        }

        public static void method1() {
            synchronized (String.class) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程a尝试获取integer.class");
                synchronized (Integer.class) {

                }

            }
        }

        public static void method2() {
            synchronized (Integer.class) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程b尝试获取String.class");
                synchronized (String.class) {

                }

            }
        }

}
