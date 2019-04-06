package com.xieyuhui.jdk.leetCode.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-15 15:37
 * @Description: 交换排序:冒泡排序
 * <p>
 * 原理：比较两个相邻的元素，将值大的元素交换至右端。
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 3, 6, 9, 8, 7, 4};
        solution(arr);
        System.out.println(JSONObject.toJSONString(arr));
    }

    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //相邻元素两两比较
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
