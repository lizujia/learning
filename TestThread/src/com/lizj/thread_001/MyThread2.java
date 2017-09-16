package com.lizj.thread_001;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        try {
            for(int i=0; i<20; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("MyThread2: " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
