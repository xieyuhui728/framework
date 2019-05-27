package com.xieyuhui.jdk.leetCode.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: xieyuhui
 * @Date: 2019-04-06 13:44
 * @Description: 插入排序:直接插入排序
 * <p>
 * 直接插入排序(Straight Insertion Sort)的基本思想是：把n个待排序的元素看成为一个有序表和一个无序表。
 * 开始时有序表中只包含1个元素，无序表中包含有n-1个元素，排序过程中每次从无序表中取出第一个元素，
 * 将它插入到有序表中的适当位置，使之成为新的有序表，重复n-1次可完成排序过程。
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 3, 6, 9, 8, 7, 4, 2};
        // 1.{1, 5, 10, 3, 6, 9, 8, 7, 4, 2};
        // 2.{1, 5, 10, 10, 6, 9, 8, 7, 4, 2};
        // 3.{1, 5, 5, 10, 6, 9, 8, 7, 4, 2};
        // 4.{1, 3, 5, 10, 6, 9, 8, 7, 4, 2};
        solution(arr);
        System.out.println(JSONObject.toJSONString(arr));
    }

    public static void solution(int[] arr) {
        int preIndex;
        int current;
        for (int i = 1; i < arr.length; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }
}
