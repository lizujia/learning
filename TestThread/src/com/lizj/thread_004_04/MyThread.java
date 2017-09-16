package com.lizj.thread_004_04;

/**
 * synchronized关键字
 * 对某个对象加锁
 * @author lizujia
 *
 */
public class MyThread {

    private static int count = 10;
    
    public synchronized static void m1() { // 这里等同于synchronized(MyThread.class)
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
    
    public static void m2() {
        synchronized(MyThread.class) { // 考虑一下这里写synchronized(this)是否可以？
            count --;
        }
    }
    
}
