package com.xieyuhui.jdk.leetCode.simple;

/**
 * @Auther: xieyuhui
 * @Date: 2019-07-14 20:38
 * @Description: 汉明距离
 * <p>
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class HamMingDistance {
    public static void main(String[] args) {

    }

    /**
     * 输入: x = 1, y = 4
     * <p>
     * 输出: 2
     * <p>
     * 解释:
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     * ↑   ↑
     * <p>
     * 上面的箭头指出了对应二进制位不同的位置。
     *
     * @param x
     * @param y
     * @return
     */
    public int solution(int x, int y) {
        //bitCount 数出整数二进制下 1 的个数
        //1^0 = 1 ,0^1 =1 ,0^0 = 0 ,1^1 = 0
        return Integer.bitCount(x^y);
    }
}
