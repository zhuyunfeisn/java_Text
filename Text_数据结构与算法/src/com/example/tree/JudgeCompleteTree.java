package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class JudgeCompleteTree {
    public static boolean Judeg(TreeNode root){
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null){
            return true;
        }
        queue.add(root);
        //找到队列中第一个为空的结点
        while (true){
          TreeNode node=queue.remove();
          if(node==null){
              break;
          }
          //无论左右孩子是不是null，都放入队列中
            queue.add(node.left);
          queue.add(node.right);
        }
        //判断队列中是不是全为null，如果是，则是完全二叉树，反之则不是
        while (!queue.isEmpty()){
            if(queue.remove()!=null){
                return false;
            }
        }
        return true;
    }
}
