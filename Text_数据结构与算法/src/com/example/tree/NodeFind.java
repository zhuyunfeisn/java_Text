package com.example.tree;

public class NodeFind {
    public static TreeNode Find(TreeNode root, char a) {
        if (root == null) {
            //为空树
            return null;
        } else {
            //树不为空
            if (root.value == a) {
                return root;
            } else {
                //根结点中没找到
                //在左子树中找
                TreeNode leftFind = Find(root.left, a);
                if (leftFind != null) {
                    //左子树中找到了
                    return leftFind;
                } else {
                    //左子树中没找到，在右子树中找
                    TreeNode rightFind = Find(root.right, a);
                    if (rightFind != null) {
                        //右子树中找到了
                        return rightFind;
                    } else {
                        //右子树中没找到
                        return null;
                    }
                }
            }
        }
    }
}