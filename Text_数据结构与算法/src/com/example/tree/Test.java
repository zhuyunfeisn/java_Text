package com.example.tree;

public class Test {
    public static void main(String[] args) {
        TreeNode a=new TreeNode('A');
        TreeNode b=new TreeNode('B');
        TreeNode c=new TreeNode('C');
        TreeNode d=new TreeNode('D');
        TreeNode e=new TreeNode('E');
        TreeNode f=new TreeNode('F');
        TreeNode g=new TreeNode('G');
        TreeNode h=new TreeNode('H');
        TreeNode i=new TreeNode('I');
        TreeNode j=new TreeNode('J');
       a.left=b;
       a.right=c;
       b.left=d;
       d.right=g;
       g.left=j;
       c.left=e;
       c.right=f;
       f.left=h;
       f.right=i;
       //System.out.println(TreeNodeCount.sumTreeNodeSize((a)));
        //TreeTraversal.preTraversal(a);
        //System.out.println(TreeLeafCount.TreeLeafcount(a));
       // System.out.println(Tree_k_LeafCount.getKLevelSize(a,4 ));
        //System.out.println(TreeHeight.getHeight(a));
       // System.out.println(NodeFind.Find(a,'B'));
       // System.out.println(NodeFind.Find(a,'O'));
        //TreeTraversal.sequenceTraversal(a);
        System.out.println(JudgeCompleteTree.Judeg(a));
    }
}
