package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    //对root为根的树进行遍历
    //遍历的对象是树，不是结点
    //虽然我们的形参看起来是结点，但实际上是以该结点为根的一棵树
    //为了简单，我们只进行结点值的打印

    //先序遍历
    public static void preTraversal(TreeNode root){
       //前提是，这棵树不是空树，有根结点

        if (root!=null) {
            //1.首先处理根节点
            System.out.println(root.value);
            //2.按照前序遍历的方式，递归处理该结点的左子树
            preTraversal(root.left);
            //3.按照前序遍历的方式，递归处理该结点的右子树
            preTraversal(root.right);
        }else {
            //什么都不处理即可
        }
    }

    //中序遍历
    public static void  inTraversal(TreeNode root){
       preTraversal(root.left);
        System.out.println(root.value);
        preTraversal(root.right);
    }

    //后序遍历
    public static void postTraversal(TreeNode root){
   preTraversal(root.left);
   preTraversal(root.right);
        System.out.println(root.value);
    }

    //层序遍历
    public static void sequenceTraversal(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            //这个node就是层序遍历经过的结点
           TreeNode node =queue.remove();
            System.out.println(node.value);
            //如果左孩子存在，放入队列
            if(node.left!=null){
                queue.add(node.left);
            }
            //如果右孩子存在，放入队列
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }

}
