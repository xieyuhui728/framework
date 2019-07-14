package com.xieyuhui.jdk.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: xieyuhui
 * @Date: 2019-06-05 08:55
 * @Description: 等待通知demo
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws Exception {
        Thread waitThread = new Thread(new Wait(), "WaitThread");
        Thread notifyThread = new Thread(new Notify(), "NotifyThread");
        waitThread.start();
        TimeUnit.SECONDS.sleep(1);
        notifyThread.start();
    }

    static class Wait implements Runnable {

        @Override
        public void run() {
            //加锁，持有lock 对象的Monitor
            synchronized (lock) {
                //条件不满足时，继续wait，同时释放锁
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread() + " flag is true,wait @ " +
                                new SimpleDateFormat("HH:mm;ss").format(new Date()));
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //条件满足时，完成工作
                System.out.println(Thread.currentThread() + " flag is false, running @ " +
                        new SimpleDateFormat("HH:mm;ss").format(new Date()));
            }
        }
    }

    static class Notify implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread() + " hold lock, notify @ " +
                            new SimpleDateFormat("HH:mm;ss").format(new Date()));
                    flag = false;
                    lock.notify();
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lock) {
                System.out.println(Thread.currentThread() + " hold lock again, sleep @ " +
                        new SimpleDateFormat("HH:mm;ss").format(new Date()));
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
