package com.xieyuhui.jdk.leetCode;

import com.xieyuhui.jdk.leetCode.common.ListNode;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-18 16:30
 * @Description: 删除链表中的节点
 * <p>
 */
public class DeleteNode {

    public static void main(String[] args) {

    }

    /**
     * @param node 需要被删除的节点
     */
    public static void solution(ListNode node) {
        //1.节点的值指向下个节点的值
        node.val = node.next.val;
        //2.节点的指针指向下个节点的指针
        node.next = node.next.next;
    }
}
