package com.example.tree;

public class TreeHeight {
    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }else if(root.left==null&&root.right==null){
            return 1;
        }else {
            int leftHeight=getHeight(root.left);
            int rightHeight=getHeight(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
}
