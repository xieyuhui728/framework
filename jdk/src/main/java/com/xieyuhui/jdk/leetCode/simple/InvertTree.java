package com.xieyuhui.jdk.leetCode.simple;

import com.xieyuhui.jdk.leetCode.common.TreeNode;

/**
 * @Auther: xieyuhui
 * @Date: 2019-07-14 21:01
 * @Description: 翻转一棵二叉树。
 */
public class InvertTree {

    public TreeNode solution(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = solution(root.right);
        TreeNode left = solution(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

}
