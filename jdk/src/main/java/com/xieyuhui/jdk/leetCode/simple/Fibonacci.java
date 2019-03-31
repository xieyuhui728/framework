package com.xieyuhui.jdk.leetCode.simple;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-25 15:16
 * @Description: 斐波那契数列:数列从第3项开始，每一项都等于前两项之和。
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，
 * 987，1597，2584，4181，6765，10946，17711，28657，46368........
 */
public class Fibonacci {
    public static void main(String[] args) {
        _fibonacci2(32);
    }

    public static void _fibonacci1(int n) {
        //设置a b c 的初始值 在后面的代码中使a b c 的值不断变化
        long a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + "\t");
            //换行
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        //输出请第n项的值:
        System.out.println("\n" + "f(" + n + ")=" + c);
    }


    public static void _fibonacci2(int n) {
        long[] arr = new long[n];
        switch (n) {
            case 1:
                arr[0] = 1;
                break;
            case 2:
                arr[0] = 1;
                arr[1] = 1;
                break;
            default:
                arr[0] = 1;
                arr[1] = 1;
                for (int i = 2; i < n; i++) {
                    //当前元素 = 前两项之和　
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
        }
        //输出前n项所有数据 每10个换一行
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(arr[i] + "\t");
        }
        //输出请第n项的值:
        System.out.println("f(" + n + ")=" + arr[arr.length - 1]);
    }
}
