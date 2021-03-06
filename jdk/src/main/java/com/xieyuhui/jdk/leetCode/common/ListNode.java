package com.xieyuhui.jdk.leetCode.common;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-05 17:38
 * @Description: 链表
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
