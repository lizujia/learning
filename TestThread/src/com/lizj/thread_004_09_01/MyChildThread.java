package com.lizj.thread_004_09_01;

public class MyChildThread extends MyThread {
    
    public synchronized static void m1() {
        System.out.println("child m1 start");
        m();
        System.out.println("child m1 end");
    }
    
    public static void m2() {
        System.out.println("child m2 start");
        m();
        System.out.println("child m2 end");
    }
    
}
