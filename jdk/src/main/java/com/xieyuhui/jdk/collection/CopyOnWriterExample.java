package com.xieyuhui.jdk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: xieyuhui
 * @Date: 2019-06-02 17:36
 * @Description:
 */
public class CopyOnWriterExample {
    public static void main(String[] args) {
//        iteratorDemo();
        forDemo();
    }

    private static void forDemo() {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
//        for (String i : list) {
//            list.remove(i);
//        }
        for (int i = 0; i <= list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list.size());
    }

    private static void iteratorDemo() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            if (integer != null) {
                iterator.remove();
            }
        }
        System.out.println(list.size());
    }
}
