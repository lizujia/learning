package com.lizj.thread_001;

public class TestMyRunnable {

    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();
        Thread thread = new Thread(run);
        thread.start();
        System.out.println("main: " + Thread.currentThread().getName());
    }
    
}
