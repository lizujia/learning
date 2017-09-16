package com.lizj.thread_001;

public class TestMyThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("main: " + Thread.currentThread().getName());
    }
    
}
