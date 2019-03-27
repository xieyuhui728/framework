package com.xieyuhui.jdk.leetCode;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-18 20:26
 * @Description: Nim游戏
 * <p>
 * 你和你的朋友，两个人一起玩 Nim游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
 * <p>
 * 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
 */
public class CanWinNim {
    public static void main(String[] args) {
        boolean f = solution(9);
        System.out.println(JSONObject.toJSONString(f));
    }

    public static boolean solution(int n) {
        return (n % 4 != 0);
    }
}
