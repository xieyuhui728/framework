package com.xieyuhui.jdk.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @Auther: xieyuhui
 * @Date: 2019-06-05 17:15
 * @Description: fork/join框架 ，用于切割任务，然后再合并结果
 */
public class FJTast extends RecursiveTask {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FJTast fjTast = new FJTast(1, 4);
        Future<Integer> result = forkJoinPool.submit(fjTast);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    //阈值
    private static final int THRESHOLD = 2;

    private int start;
    private int end;

    public FJTast(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Object compute() {
        int sum = 0;
        boolean canCompute = (end - start) <= THRESHOLD;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            //切割任务
            int middle = (start + end) / 2;
            FJTast leftTast = new FJTast(start, middle);
            FJTast rightTast = new FJTast(middle + 1, end);
            //调用fork方法时，会递归进入compute方法
            leftTast.fork();
            rightTast.fork();
            int leftResult = (int) leftTast.join();
            int rightResult = (int) rightTast.join();
            sum = leftResult + rightResult;
        }
        return sum;

    }
}
