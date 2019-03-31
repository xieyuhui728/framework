package com.xieyuhui.jdk.leetCode.simple;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-29 13:11
 * @Description: 反转字符串
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 */
public class ReverseString {
    public static void main(String[] args) {
//        String[] strings = {"A", " ", "m", "a", "n", ",", " ", "a",
//                " ", "p", "l", "a", "n", ",", " ", "a", " ", "c", "a",
//                "n", "a", "l", ":", " ", "P", "a", "n", "a", "m", "a"};
//        char[] chars = {'a', 'b'};
//        reverseString(chars);
//        System.out.println(JSONObject.toJSONString(chars));

        System.out.println(JSONObject.toJSONString(reverseWords("Let's take LeetCode contest")));
    }

    public static void reverseString(char[] chars) {
        if (chars == null || chars.length <= 0) {
            return;
        }
        int tail = chars.length - 1;
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[tail - i];
            chars[tail - i] = temp;
        }
    }

    /**
     * 反转字符串中的单词 III
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     * *注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
     *
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        if (s == null || s.length() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            sb.append(reverseString(strings[i]));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * 反转单个String
     */
    private static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        char[] chars = string.toCharArray();
        int tail = chars.length - 1;
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[tail - i];
            chars[tail - i] = temp;
        }
        return sb.append(new String(chars)).toString();
    }
}
