package com.xieyuhui.jdk.alg;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-19 18:04
 * @Description: 二分查找算法
 */
public class BinarySearch {

    /**
     * @param array 数组
     * @param key   查找的元素
     * @return 下标值
     */
    public static int binSearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int key = 11;
        int index = binSearch(array, key);
        System.out.println(index);
    }
}
