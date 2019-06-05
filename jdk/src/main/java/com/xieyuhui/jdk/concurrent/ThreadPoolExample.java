package com.xieyuhui.jdk.concurrent;

import com.xieyuhui.jdk.concurrent.factory.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-31 15:08
 * @Description:
 */
public class ThreadPoolExample {

    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder();
        ((ThreadFactoryBuilder) threadFactory).setThreadName("TimerTaskThread");
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(5, 15,
                200L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(5), threadFactory, new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 20; i++) {
            MyTask myTask = new MyTask(i);
            executorService.execute(myTask);
            System.out.println("线程池中线程数目：" + executorService.getCorePoolSize() + "，队列中等待执行的任务数目：" +
                    executorService.getQueue().size() + "，已执行完别的任务数目：" + executorService.getCompletedTaskCount());
        }
        executorService.shutdown();

    }

    static class MyTask implements Runnable {
        private int taskNum;

        public MyTask(int num) {
            this.taskNum = num;
        }

        @Override
        public void run() {
            System.out.println("正在执行task " + taskNum);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task " + taskNum + "执行完毕");
        }
    }
}
