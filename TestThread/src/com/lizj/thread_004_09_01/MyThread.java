package com.lizj.thread_004_09_01;

/**
 * 一个同步方法可以调用另外一个同步方法, 
 * 一个线程已经拥有某个对象的锁, 
 * 再次申请的时候仍然会得到该对象的锁.
 * 也就是说synchronized获得的锁是可重入的.
 * 这里是继承中有可能发生的情形, 子类调用父类的同步方法
 * @author lizujia
 *
 */
public class MyThread {

    public synchronized static void m() {
        System.out.println("parent m start " + Thread.currentThread().getName());
        try {
             Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("parent m end " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        // new MyChildThread().m();
        // MyChildThread mct = new MyChildThread();
        
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MyChildThread.m1();
            }
        }, "thread-m1").start();
        MyChildThread.m2();
    }
    
}
