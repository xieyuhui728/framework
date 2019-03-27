package com.xieyuhui.jdk.leetCode;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-19 10:39
 * @Description: 子集
 * <p>
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class SubSets {

    public static void main(String[] args) {
        int[] nums = {1, 2};
        List<List<Integer>> result = solution(nums);
        System.out.println(JSONObject.toJSONString(result));
    }

    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        if (nums == null || nums.length == 0) {
            return result;
        }
        //思路:
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> res2 = new ArrayList<>(result);
            for (int j = 0; j < res2.size(); j++) {
                List<Integer> list = res2.get(j);
                List<Integer> tmp = new ArrayList<>(list);
                tmp.add(nums[i]);
                result.add(tmp);
            }
        }
        return result;
    }


}
