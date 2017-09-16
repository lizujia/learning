package com.lizj.thread_002;

public class Test02MyThread {

    public static void main(String[] args) {
        Box box = new Box(5);
        MyThread thread1 = new MyThread(box, "thread1");
        MyThread thread2 = new MyThread(box, "thread2");
        MyThread thread3 = new MyThread(box, "thread3");
        MyThread thread4 = new MyThread(box, "thread4");
        MyThread thread5 = new MyThread(box, "thread5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
    
}
