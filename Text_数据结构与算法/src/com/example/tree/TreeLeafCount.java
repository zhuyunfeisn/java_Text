package com.example.tree;

public class TreeLeafCount {
    private static int n;//记录叶子结点的个数
    public static int TreeLeafcount(TreeNode root){
        n=0;
        LeafCount(root);
        return n;
    }
    public static void LeafCount(TreeNode root){
        if(root!=null){
            if(root.left!=null||root.right!=null){
                LeafCount(root.left);
                LeafCount(root.right);
            }else {
                n++;
            }
        }
    }
}
