package com.lizj.thread_002;

public class Box {

    public int count;
    
    public Box(int count) {
        this.count = count;
    }
    
    /*public void decrease() {
        this.count --;
        System.out.println(Thread.currentThread().getName() + " 操作Box, count = " + this.count);
    }*/
    
    public void decrease() {
        System.out.println(Thread.currentThread().getName() + " 操作Box, count = " + this.count --);
    }

}
