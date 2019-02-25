package com.xieyuhui.jdk.leetCode;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-25 16:39
 * @Description: 反转链表
 */
public class ReverseList {

    public static void main(String[] args) {

    }

    class Node {
        int index;
        Node next;

        public Node(int index, Node next) {
            this.index = index;
            this.next = next;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static Node _reverseList(Node node) {
        //当前节点
        Node now = node;
        //当前节点的前驱节点
        Node prev = null;
        //当前节点的后驱节点
        Node next = null;
        //定义尾节点
        Node tail = null;
        while (now != null) {
            //next 指向当前节点的下个节点
            next = now.next;
            //如果是尾节点
            if (null == next) {
                tail = now;
            }
            //链表指针反转，当前节点的next指针指向前一个节点。此时方式链表断裂
            now.next = prev;
            //前驱指针后移一个节点
            prev = now;
            //当前指针后移一个节点
            now = next;
        }
        return tail;
    }
}
