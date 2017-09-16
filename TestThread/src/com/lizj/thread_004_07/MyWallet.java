package com.lizj.thread_004_07;

/**
 * 对业务写方法加锁
 * 对业务读方法不加锁
 * 容易产生脏读问题(dirtyRead)
 * @author lizujia
 *
 */
public class MyWallet {

    public String name;
    public int count;
    
    public synchronized void set(String name, int count) {
        this.name = name;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.count = count;
    }
    
    public int get(String name) {
        return this.count;
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        MyWallet wallet = new MyWallet();
        new Thread(new Runnable() {
            
            @Override
            public void run() {
                wallet.set("zhangsan", 100);
            }
            
        }, "thread1").start();
        
        Thread.sleep(1000);
        System.out.println(wallet.get("zhangsan"));
        Thread.sleep(2000);
        System.out.println(wallet.get("zhangsan"));
        
    }
    
}
