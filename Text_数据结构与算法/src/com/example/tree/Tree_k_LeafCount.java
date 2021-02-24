package com.example.tree;

public class Tree_k_LeafCount {
  //给定一棵二叉树，求该二叉树，第k层的节点个数

 public static int getKLevelSize(TreeNode root,int k){
     //1.空树情况
     if(root==null){
         return 0;
     }else if(k==1){
         //第一层结点个数
         return 1;
     }else {
         //其他情况
         int leftLeafK_1=getKLevelSize(root.left, k-1);
         int rightLeafK_1=getKLevelSize(root.right, k-1);
         return leftLeafK_1+rightLeafK_1;
     }

}

 }

