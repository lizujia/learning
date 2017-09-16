package com.lizj.thread_001;

public class TestMyThread2 {

    public static void main(String[] args) throws InterruptedException {
        
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("MyThread");
        myThread2.start();
        for(int i=0; i<10; i++) {
            int time = (int) (Math.random() * 1000);
            Thread.sleep(time);
            System.out.println("main: " + Thread.currentThread().getName());
        }
        
    }
    
}
