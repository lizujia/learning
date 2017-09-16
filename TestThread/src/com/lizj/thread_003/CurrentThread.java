package com.lizj.thread_003;

public class CurrentThread extends Thread {

    public CurrentThread() {
        System.out.println("构造方法: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法: " + Thread.currentThread().getName());
    }
    
}
