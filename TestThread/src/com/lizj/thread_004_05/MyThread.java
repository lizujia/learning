package com.lizj.thread_004_05;

/**
 * 分析一下这个程序的输出
 * @author lizujia
 *
 */
public class MyThread implements Runnable {

    private int count = 10;
    
    public void run() { 
        count --;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
    
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        for(int i=0; i<5; i++) {
            new Thread(thread, "thread" + i).start();
        }
    }
    
}
