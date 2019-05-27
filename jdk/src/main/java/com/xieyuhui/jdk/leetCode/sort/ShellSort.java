package com.xieyuhui.jdk.leetCode.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: xieyuhui
 * @Date: 2019-04-06 16:23
 * @Description: 插入排序:希尔排序
 * <p>
 * 1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。
 * 基本思想是：设待排序元素序列有n个元素，首先取一个整数increment（小于n）作为间隔将全部元素分为increment个子序列，
 * 所有距离为increment的元素放在同一个子序列中，在每一个子序列中分别实行直接插入排序。然后缩小间隔increment，
 * 重复上述子序列划分和排序工作。直到最后取increment=1，将所有元素放在同一个子序列中排序为止。
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 10, 3, 6, 9, 8, 7, 4, 2, 0};
        solution(arr);
        System.out.println(JSONObject.toJSONString(arr));
    }

    public static void solution(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int current = arr[i];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && current < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = current;
                }
            }
        }
    }
}
