package com.lizj.thread_003;

public class ThreadSleep extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
