package com.xieyuhui.jdk.leetCode.array;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: xieyuhui
 * @Date: 2019-06-26 16:58
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(JSONObject.toJSONString(nums));
    }


    /**
     * 寻找数组中第二小元素
     *
     * @param array
     * @return
     */
    public static int secondMinKey(int[] array) {
        return 0;
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
