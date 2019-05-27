package com.xieyuhui.jdk.leetCode.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-24 20:30
 * @Description: 交换排序:快速排序
 *  快速排序原理即是，选择数组中的一个元素作为基准值 pivot（通常使用第一个就行），
 *  然后遍历其他元素，将小于 pivot 的元素放置在左边，将大于 pivot 的元素放置在右边。
 *  可以得到两个子数组，再依次对子数组进行快速排序，最终完成排序。
 */
public class QuickSort {
    public static void main(String[] args) {
        System.out.println("Hello QuickSort");
        int[] a = {12, 20, 5, 16, 15, 1, 30, 45, 23, 9};
        int start = 0;
        int end = a.length - 1;
//        sort(a, start, end);
        quickSort(a, start, end);
        System.out.println(JSONObject.toJSONString(a));
    }


    public static void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int low = start;
        int high = end;
        //基准
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            // 将小于 pivot 的数放在低位
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) {
                low++;
            }
            // 将大于 pivot 的数放在高位
            arr[high] = arr[low];
        }
        //重制基准
        arr[low] = pivot;
        // 递归排序左半部分
        quickSort(arr, start, low - 1);
        // 递归排序右半部分
        quickSort(arr, low + 1, end);
    }

    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        while (end > start) {
            //从后往前比较
            //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
            while (end > start && a[end] >= key) {
                end--;
            }
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
            while (end > start && a[start] <= key) {
                start++;
            }
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if (start > low) {
            sort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        }
        if (end < high) {
            sort(a, end + 1, high);//右边序列。从关键值索引+1到最后一个
        }
    }


}
