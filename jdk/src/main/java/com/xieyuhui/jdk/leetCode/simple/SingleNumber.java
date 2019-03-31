package com.xieyuhui.jdk.leetCode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-31 10:43
 * @Description: 只出现一次的数字
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 3};
        int result = solution(nums);
        System.out.println(result);
    }

    /**
     * 运算规则：0^0=0；  0^1=1；  1^0=1；   1^1=0；
     * 即：参加运算的两个对象，如果两个相应位为“异”（值不同），则该位结果为1，否则为0。
     * <p>
     * 交换律：a ^ b ^ c <=> a ^ c ^ b
     * <p>
     * 任何数于0异或为任何数 0 ^ n => n
     * <p>
     * 相同的数异或为0: n ^ n => 0
     * <p>
     * var a = [2,3,2,4,4]
     * <p>
     * 2 ^ 3 ^ 2 ^ 4 ^ 4等价于 2 ^ 2 ^ 4 ^ 4 ^ 3 => 0 ^ 0 ^3 => 3
     *
     * @param nums
     * @return
     */
    public static int solution(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res ^= i;
//            res = res ^ i;
        }
        return res;
    }
}
