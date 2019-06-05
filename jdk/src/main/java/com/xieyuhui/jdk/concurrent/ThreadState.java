package com.xieyuhui.jdk.concurrent;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: xieyuhui
 * @Date: 2019-05-28 22:19
 * @Description:
 */
public class ThreadState {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Thread(new TimeWaiting(), "TimeWaitingThread").start();
        new Thread(new Waiting(), "WaitingThread").start();
        new Thread(new Blocked(), "BlockedThread-1").start();
        new Thread(new Blocked(), "BlockedThread-2").start();
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        ThreadCallable threadCallable = new ThreadCallable();
        FutureTask<String> futureTask = new FutureTask<>(threadCallable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }

    static class ThreadDemo extends Thread {
        @Override
        public void run() {
            System.out.println("extends thread class");
        }
    }

    static class ThreadCallable implements Callable{

        @Override
        public Object call() {
            System.out.println("implements Callable");
            return "callable return";
        }
    }

    static class TimeWaiting implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Waiting implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (Waiting.class) {
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocked implements Runnable {

        @Override
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
