package com.xieyuhui.jdk.datastructure;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-27 19:35
 * @Description: 递归简论
 * <p>
 * 递归的四个基本法则：
 * 1.基准情形：必须总要有某些基准的情形，它们不用递归就能求解。
 * 2.不断推进：那些要递归求解的情形，递归调用必须总能朝着一个基准情形推进。
 * 3.设计法则：假设所有的递归调用都能进行。
 * 4.合成效益法则：在求解一个问题的同一个实例时，切勿在不同的递归调用中做重复性的工作。
 */
public class RecursionDemo {
    public static void main(String[] args) {
        int result = mod(411);
        System.out.println(result);
    }

    public static int f(int x) {
        int result = 0;
        if (x == 0) {
            return 0;
        } else {
            result = 2 * f(x - 1) + x * x;
        }
        return result;
    }


    public static int mod(int n) {
//        return n % 100;
        //取模公式 A Mod B=A-(A div B) * B （div含义为整除）
        return n - (n / 100) * 100;

    }
}
