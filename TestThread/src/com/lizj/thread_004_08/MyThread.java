package com.lizj.thread_004_08;

/**
 * 一个同步方法可以调用另外一个同步方法, 
 * 一个线程已经拥有某个对象的锁, 
 * 再次申请的时候仍然会得到该对象的锁.
 * 也就是说synchronized获得的锁是可重入的
 * @author lizujia
 *
 */
public class MyThread {

    public synchronized void m1() {
        System.out.println("m1 start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
    }
    
    public synchronized void m2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2");
    }
    
}
