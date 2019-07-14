package com.xieyuhui.jdk.leetCode.simple;

import com.xieyuhui.jdk.leetCode.common.TreeNode;

/**
 * @Auther: xieyuhui
 * @Date: 2019-07-14 20:22
 * @Description: 合并二叉树
 * 树的解法一般用递归
 */
public class MergeTrees {
    public static void main(String[] args) {

    }

    public TreeNode solution(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode result = new TreeNode(t1.val + t2.val);
        result.left = solution(t1.left, t2.left);
        result.right = solution(t1.right, t2.right);
        return result;
    }
}
