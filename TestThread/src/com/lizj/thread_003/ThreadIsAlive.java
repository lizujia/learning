package com.lizj.thread_003;

public class ThreadIsAlive extends Thread {

    @Override
    public void run() {
        System.out.println("This thread is alive: " + this.isAlive());
    }
    
}
