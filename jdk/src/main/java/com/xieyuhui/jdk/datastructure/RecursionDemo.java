package com.xieyuhui.jdk.datastructure;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-27 19:35
 * @Description: 递归简论
 */
public class RecursionDemo {
    public static void main(String[] args) {
        int result = f(2);
        System.out.println(result);
    }

    public static int f(int x) {
        if (x == 0) {
            return 0;
        } else {
            return 2 * f(x - 1) + x * x;
        }
    }
}
