package com.lizj.thread_003;

public class TestThreadSleep {

    public static void main(String[] args) {
        ThreadSleep thread = new ThreadSleep();
        System.out.println(Thread.currentThread().getName() + " begin, " + System.currentTimeMillis());
        thread.start();
        System.out.println(Thread.currentThread().getName() + "   end, " + System.currentTimeMillis());
    }
    
}
