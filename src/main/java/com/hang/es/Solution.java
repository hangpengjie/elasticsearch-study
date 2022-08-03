package com.hang.es;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        System.out.println("hello");
        System.out.println("hello-hot-fix");
        System.out.println("hello-master");
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int ans = 1;
        int max = Integer.MIN_VALUE;
        int step = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            int cur = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                cur += node.val;
                if(node.left != null)   queue.offer(node.left);
                if(node.right != null)   queue.offer(node.right);
            }
            if(cur > max){
                max = cur;
                ans = step;
            }
            step++;
        }
        return ans;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}