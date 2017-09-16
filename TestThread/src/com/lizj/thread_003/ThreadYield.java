package com.lizj.thread_003;

public class ThreadYield extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i=0; i<5000000; i++) {
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - beginTime));
    }
    
}
