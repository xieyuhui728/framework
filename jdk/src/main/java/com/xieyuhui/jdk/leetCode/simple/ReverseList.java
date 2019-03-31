package com.xieyuhui.jdk.leetCode.simple;

import com.xieyuhui.jdk.leetCode.common.ListNode;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-25 16:39
 * @Description: 反转链表：
 * 保存当前头节点的下一个节点（当前头节点为2，先将节点3 保存起来）
 * <p>
 * 将当前头节点的下一个节点指向 “上一个节点”（当前头节点2 指向了 (“上一个节点”)节点1），这一步才是实现反转
 * <p>
 * 将当前头节点设置 “上一个节点”（将节点2 设为“上一个节点”）
 * <p>
 * 将保存的下一个节点设置 “头节点”（将节点3 设为“头节点”）
 * <p>
 * 链接：https://blog.csdn.net/xyh269/article/details/70238501
 */
public class ReverseList {

    public static void main(String[] args) {

    }


    public static ListNode solution(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        //循环至尾节点
        while (head != null) {
            //next一直保存当前节点的下个节点
            next = head.next;
            //反转，当前指向下个节点的指针指向上一个节点
            head.next = pre;
            //将当前头节点设置 “上一个节点”
            pre = head;
            //将保存的下一个节点设置为 “头节点”
            head = next;
        }
        return pre;

    }
}
