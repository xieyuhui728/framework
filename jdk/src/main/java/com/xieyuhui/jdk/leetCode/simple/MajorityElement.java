package com.xieyuhui.jdk.leetCode.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-31 13:51
 * @Description: 求众数
 * <p>
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution(nums);
        System.out.println(result);
    }

    public static int solution(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
        int count = 1;
        int maj = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maj == nums[i]) {
                ++count;
            } else {
                --count;
                if (count == 0) {
                    maj = nums[i + 1];
                }
            }
        }
        return maj;
    }
}
