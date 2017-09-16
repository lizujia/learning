package com.lizj.thread_002;

public class MyThread extends Thread {

    public Box box;
    
    public MyThread(Box box, String threadName) {
        this.box = box;
    }
    
    @Override
    public void run() {
        this.box.decrease();
    }
    
}
