package com.xieyuhui.jdk.leetCode.simple;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-19 18:04
 * @Description: 二分查找算法:
 * mid = (end+start/2)
 * 取数组的mid下标值，查找的元素跟mid值比较。
 * 如果比mid值小，则end下标向前移一位，
 * 如果比mid值大，则start下标向后移一位。
 */
public class BinarySearch {

    /**
     * @param array 数组
     * @param key   查找的元素
     * @return 下标值
     */
    public static int binSearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int key = 13;
        int index = binSearch(array, key);
        System.out.println(index);
    }
}
