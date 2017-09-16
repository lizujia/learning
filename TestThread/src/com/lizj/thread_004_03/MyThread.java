package com.lizj.thread_004_03;

/**
 * synchronized关键字
 * 对某个对象加锁
 * @author lizujia
 *
 */
public class MyThread {

    private int count = 10;
    
    public synchronized void m() { // 等同于在方法的代码执行时要synchronized(this)
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
    
}
