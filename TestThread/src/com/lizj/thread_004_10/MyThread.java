package com.lizj.thread_004_10;

/**
 * 程序执行过程中, 如果出现异常, 默认情况锁会被释放
 * @author lizujia
 *
 */
public class MyThread {

    int count = 0;
    
    public synchronized void m() {
        System.out.println(Thread.currentThread().getName() + " start");
        while(true) {
            count ++;
            System.out.println(Thread.currentThread().getName() + " count: " + count);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            try {
                if(count == 5) {
                    int n = 1/0;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Runnable runnable = new Runnable() {
            public void run() {
                myThread.m();
            }
        };
        
        new Thread(runnable, "thread01").start();
        Thread.sleep(1000);
        new Thread(runnable, "thread02").start();
        
    }
    
}
