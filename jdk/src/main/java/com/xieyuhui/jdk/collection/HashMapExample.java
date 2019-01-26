package com.xieyuhui.jdk.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-23 14:55
 * @Description:
 */
public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
