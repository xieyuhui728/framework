package com.xieyuhui.jdk.leetCode.simple;

import com.xieyuhui.jdk.leetCode.common.TreeNode;

/**
 * @Auther: xieyuhui
 * @Date: 2019-03-18 17:52
 * @Description: 二叉树最大深度
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class MaxDepth {

    public static void main(String[] args) {

    }

    public static int solution(TreeNode node) {
        return node == null ? 0 : Math.max(solution(node.left), solution(node.right)) + 1;
    }
}
