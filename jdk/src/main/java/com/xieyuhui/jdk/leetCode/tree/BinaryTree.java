package com.xieyuhui.jdk.leetCode.tree;

import com.xieyuhui.jdk.leetCode.common.TreeNode;

/**
 * @Auther: xieyuhui
 * @Date: 2019-04-21 13:41
 * @Description: 二叉树
 */
public class BinaryTree {

    /**
     * 前序遍历 递归
     *
     * @param root
     */
    public void preOrder1(TreeNode root) {
        while (root != null) {
            System.out.println(root.val);
            preOrder1(root.left);
            preOrder1(root.right);
        }
    }

    public void preOrder2(TreeNode root){

    }

}
