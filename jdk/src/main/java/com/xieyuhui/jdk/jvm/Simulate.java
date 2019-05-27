package com.xieyuhui.jdk.jvm;

/**
 * @Auther: xieyuhui
 * @Date: 2019-04-20 18:52
 * @Description: 死循环
 */
public class Simulate {

    public static void main(String[] args) {
        deadMethod();
    }

    public static void deadMethod() {
        int count = 0;
        while (true) {
            count++;
        }
    }
}
