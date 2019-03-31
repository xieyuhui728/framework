package com.xieyuhui.jdk.leetCode.simple;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-05 15:54
 * @Description: 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TowSum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 6, 10, -1, 9, 7};
        int[] result = solution2(arr, 10);
        System.out.println(JSONObject.toJSONString(result));
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution1(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }
        int[] result = new int[2];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution2(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
