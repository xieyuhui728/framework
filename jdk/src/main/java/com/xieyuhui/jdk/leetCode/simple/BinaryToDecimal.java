package com.xieyuhui.jdk.leetCode.simple;

/**
 * @Auther: xieyuhui
 * @Date: 2019-04-16 10:56
 * @Description: 十进制转二进制
 * <p>
 * 将一个十进制数除以二，得到的商再除以二，依此类推直到商等于一或零时为止，倒取除得的余数，即换算为二进制数的结果。
 * 只需记住要点：除二取余，倒序排列。
 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(solution(125));
        System.out.println(decimalToBinary(110111));
    }

    public static String solution(int n) {
        String str = "";
        while (n > 0) {
            str = n % 2 + str;
            n = n / 2;
        }
        return str;
    }

    /**
     * 二进制转十进制
     *
     * @param binaryNumber
     * @return
     */
    public static int decimalToBinary(int binaryNumber) {
        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber = binaryNumber / 10;
                p++;
            }
        }
        return decimal;
    }
}
