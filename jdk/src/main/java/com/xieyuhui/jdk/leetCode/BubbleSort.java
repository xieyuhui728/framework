package com.xieyuhui.jdk.leetCode;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-15 15:37
 * @Description:
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {0, 1, 5, 3, 6, 9, 10};
        solution(arr);
        System.out.println(JSONObject.toJSONString(arr));
    }

    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
