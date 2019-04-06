package com.xieyuhui.jdk.leetCode.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: xieyuhui
 * @Date: 2019-04-06 12:53
 * @Description: 选择排序:简单选择排序
 * <p>
 * 工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 3, 6, 9, 8, 7, 4};
        solution(arr);
        System.out.println(JSONObject.toJSONString(arr));
    }

    public static void solution(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //获取最数组中最小值并保存到minIndex变量中
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
