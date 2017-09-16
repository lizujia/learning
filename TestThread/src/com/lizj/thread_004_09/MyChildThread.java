package com.lizj.thread_004_09;

public class MyChildThread extends MyThread {
    
    public synchronized void m1() {
        System.out.println("child m1 start");
        m();
        System.out.println("child m1 end");
    }
    
    public void m2() {
        System.out.println("child m2 start");
        m();
        System.out.println("child m2 end");
    }
    
}
