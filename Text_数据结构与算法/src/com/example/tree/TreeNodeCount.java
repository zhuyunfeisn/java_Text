package com.example.tree;

public class TreeNodeCount {
    private  static int n;//静态变量，记录结点个数，作用域是大括号内
    //返回根为root的树中，有多少个结点
    public static int  sumTreeNodeSize(TreeNode root){
         n=0;//每次计数前，先把n归零
        preTraversal(root);
        return n;
    }

    public static void preTraversal(TreeNode root){
        //1.一个树的结点（root！=null）
        //2.没有结点（root==null）
        if(root!=null){
            //处理根的时候不打印，执行n++
             n++;
            preTraversal(root.left);
            preTraversal(root.right);
        }
    }
}
