package com.lizj.thread_003;

public class TestThreadIsAlive {

    public static void main(String[] args) throws InterruptedException {
        ThreadIsAlive thread = new ThreadIsAlive();
        System.out.println("begin: " + thread.isAlive());
        thread.start();
        System.out.println("end: " + thread.isAlive());
    }
    
}
