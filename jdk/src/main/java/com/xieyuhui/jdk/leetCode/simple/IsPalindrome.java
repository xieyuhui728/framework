package com.xieyuhui.jdk.leetCode.simple;

import java.util.Arrays;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-31 16:18
 * @Description: 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * leetcode solution: https://leetcode-cn.com/problems/palindrome-number/solution/
 */
public class IsPalindrome {
    public static void main(String[] args) {
        int x = -1321;
        System.out.println(reverse(x));
    }

    /**
     * 只反转 数字的一半？如果该数字是回文，其后半部分反转后应该与原始数字的前半部分相同。
     *
     * @param x
     * @return
     */
    public static boolean optimizeSolution(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + (x % 10);
            x /= 10;
        }
        System.out.println(revertedNumber);
        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static boolean solution(int x) {
        if (x < 0) {
            return false;
        }
        char[] c = String.valueOf(x).toCharArray();
        int tail = c.length - 1;
        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[tail - i];
            c[tail - i] = temp;
        }
        String s = new String(c);
        if (s.equals(String.valueOf(x))) {
            return true;
        }
        return false;
    }

    /**
     * 整数反转
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
