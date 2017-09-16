package com.lizj.thread_004_09;

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

    public synchronized void m() {
        System.out.println("parent m start " + Thread.currentThread().getName());
        try {
             Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("parent m end " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        MyChildThread mct = new MyChildThread();
        Thread threadm1 = new Thread(new Runnable() {
            public void run() {
                mct.m1();
            }
        }, "thread-m1");
        Thread threadm2 = new Thread(new Runnable() {
            public void run() {
                mct.m2();
            }
        }, "thread-m2");
        threadm2.start();
        Thread.sleep(1000); 
        threadm1.start();
        
    }
    
}
