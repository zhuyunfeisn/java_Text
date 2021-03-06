package com.example.leetcode_Tree;

public class Solution1 {



    public boolean isBalanced(TreeNode root) {
     if(root==null){
         return true;
     }
     if(root.left==null&&root.right==null){
         return true;
     }
     if(maxDepth(root)<=2){
         return true;
     }
     return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }



    public int maxDepth(TreeNode root) {
      if(root==null){
          return 0;
      }else if(root.left==null&&root.right==null){
          return 1;
      }else {
          int leftheight=maxDepth(root.left);
          int rightheight=maxDepth(root.right);
          return Math.max(leftheight, rightheight)+1;
      }
    }
}
