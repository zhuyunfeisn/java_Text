package com.example.leetcode_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class Solution {

    static class NL{
      public  TreeNode node;
      public int level;

        public NL(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> list=new ArrayList<>();
        Queue<NL>queue=new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.add(new NL(root,0));
        while (!queue.isEmpty()){
            NL nl=queue.remove();
            TreeNode node=nl.node;
            int level=nl.level;
            //控制放到哪个内部list，以及是否需要新创建list
            if(level==list.size()){
                list.add(new ArrayList<>());
            }
            List<Integer> templist=list.get(level);
            templist.add(node.val);

            //继续层序遍历的流程
            if(node.left!=null){
                queue.add(new NL(node.left,level+1));
            }
            if(node.right!=null){
                queue.add(new NL(node.right,level+1));
            }
        }
        return list;
    }




    public boolean isSubtree(TreeNode s, TreeNode t) {
        return Find(s, t);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        return p.val==q.val&&isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static boolean Find(TreeNode root, TreeNode t) {
       if(root==null){
           return false;
       }
       if(root.val==t.val){
           if(isSameTree(root, t)){
               return true;
           }
       }
       if(Find(root.left, t)){
           return true;
       }
       return Find(root.right, t);
    }
}