package com.example.binarysearchtree;

public class BinarySearchTree {
    private Node root;

    //刚创建为空树
    public BinarySearchTree() {
        root = null;
    }

    //查找
    public boolean search(Integer key) {
        Node current = root;
        while (current != null) {
            int result = key.compareTo(current.key);
            if (result == 0) {
                return true;
            } else if (result > 0) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }

    //插入
    public void insert(Integer key) {
        //处理空树
        if (root == null) {
            root = new Node(key);
            return;
        }
        Node current = root;
        //定义一个parent结点，parent结点始终为current的父节点
        Node parent = null;

        while (current != null) {
            int result = key.compareTo(current.key);
            if (result == 0) {
                throw new RuntimeException("二叉搜索树中不允许插入重复的值:" + key);
            } else if (result < 0) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        //此时current结点为空，parent结点代表要插入结点的父节点,此时判断插入结点在左还是右
        int temp = key.compareTo(parent.key);
        if (temp < 0) {
            parent.left = new Node(key);
        } else {
            parent.right = new Node(key);
        }

    }


    //删除
    public boolean remove(Integer key) {
        //查找包含key的结点，记作current，parent为node的父节点

        Node parent=null;
        Node current=root;
        while (current!=null){
            int cmp=key.compareTo(current.key);
            if(cmp==0){
                //如果找到，删除该节点
                removeInternal(current,parent);
                return true;
            }else if(cmp<0){
                parent=current;
                current=current.left;
            }else{
                parent=current;
                current=current.right;
            }
        }
        //没找到
        return false;
    }

    //node为找到的结点，parent为node的父节点
    private void removeInternal(Node node, Node parent) {

        //情况一：node是叶子结点
        if(node.left==null&&node.right==null){
            if(node==root){
                //1.该树只有一个根结点
                root=null;
                //node不为根结点，则parent一定存在
            }else if(node==parent.left){
               //node是parent的左孩子
                parent.left=null;
            }else {
                //node是parent的右孩子
                parent.right=null;
            }
        }else if(node.left!=null&&node.right==null){
            //情况二：node不是叶子结点，但是其只有一个孩子
            //1.有左孩子
            if(node==root){
                //node是根节点
                root=node.left;
            }else if(node==parent.left){
                //判断node是父节点的左孩子
                 parent.left=node.left;
            }else {
                //判断node是父节点的右孩子
                parent.right=node.left;
            }

        }else if(node.left==null&&node.right!=null){
            //情况二：node不是叶子结点，但是其只有一个孩子
            //2.有右孩子
            if(node==root){
                //判断node是不是根节点
                root=node.right;
            }else if(node==parent.left){
                //判断node是parent的左孩子
                parent.left=node.right;
            }else {
                //判断node是parent的右孩子
                parent.right=node.right;
            }
        }else {
            //情况三：node的左右孩子都存在
            //使用替换法删除(使用node左子树中的最大值，或者右子树中的最小值替换node.key
            //这里采用：使用左子树中的最小值替换的方法,记为ghost，ghost的双亲结点为ghostParent
            Node ghostParent=node;
            Node ghost=node.left;
            //ghost一路朝右查找，知道ghost.right==null为止
            while (ghost.right!=null){
                ghostParent=ghost;
                ghost=ghost.right;
            }
            //1.替换node的key为ghost的key
            node.key=ghost.key;
            //2.删除ghost结点（ghost的右孩子一定为空）

            //<1>当node==ghostParent时，ghost是ghostParent的左孩子
             if(node==ghostParent){
                 ghostParent.left=ghost.left;
             }else {
                 //ghost一定为ghostParent的右孩子
                 ghostParent.right=ghost.left;
             }

        }

    }
}
