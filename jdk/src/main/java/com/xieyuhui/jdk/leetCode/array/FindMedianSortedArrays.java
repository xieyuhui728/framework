package com.xieyuhui.jdk.leetCode.array;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-31 15:32
 * @Description: 寻找两个有序数组的中位数 中位数，又称中点数，中值。
 * 中位数是按顺序排列的一组数据中居于中间位置的数，即在这组数据中，有一半的数据比他大，有一半的数据比他小
 * <p>
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空
 * <p>
 * 题解：https://leetcode-cn.com/problems/median-of-two-sorted-arrays/solution/
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {5, 7, 8};
        double result = solution(nums1, nums2);
        System.out.println(result);
    }

    public static double solution(int[] nums1, int[] nums2) {
        return 0.0;
    }
}
