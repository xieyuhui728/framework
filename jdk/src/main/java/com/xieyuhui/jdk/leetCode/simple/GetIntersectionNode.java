package com.xieyuhui.jdk.leetCode.simple;

import com.xieyuhui.jdk.leetCode.common.ListNode;

import java.util.*;

/**
 * @Auther: xieyuhui
 * @Date: 2019-07-13 20:06
 * @Description: 找到两个单链表相交的起始节点。
 */
public class GetIntersectionNode {
    public static void main(String[] args) {

    }

    /**
     * 双指针法
     * 创建两个指针 pA 和 pB，分别初始化为链表 A 和 B 的头结点。然后让它们向后逐结点遍历。
     * 当 pA 到达链表的尾部时，将它重定位到链表 B 的头结点 (你没看错，就是链表 B); 类似的，当 pB 到达链表的尾部时，将它重定位到链表 A 的头结点。
     * 若在某一时刻 pA 和 pB 相遇，则 pA/pB 为相交结点。
     * 想弄清楚为什么这样可行, 可以考虑以下两个链表: A={1,3,5,7,9,11} 和 B={2,4,9,11}，相交于结点 9。
     * 由于 B.length (=4) < A.length (=6)，pB 比 pA 少经过 2 个结点，会先到达尾部。
     * 将 pB 重定向到 A 的头结点，pA 重定向到 B 的头结点后，pB 要比 pA 多走 2 个结点。因此，它们会同时到达交点。
     * 如果两个链表存在相交，它们末尾的结点必然相同。因此当 pA/pB 到达链表结尾时，记录下链表 A/B 对应的元素。若最后元素不相同，则两个链表不相交。
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode solution(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Map map = new HashMap<ListNode, Integer > ();
        while (headA != null) {
            map.put(headA,headA.val);
            headA = headA.next;
        }
        while (headB != null) {
            if (map.containsKey(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }
}
