package com.yyf.lianbiao.binaryTree;

/**
 * @Author: yyf
 * @Description:
 * @Date:in 2020/6/11 21:08
 **/

public class LinkedBinaryTree implements BinaryTree {
    private Node root;//根节点

    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    public LinkedBinaryTree() {
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        System.out.println("二叉树节点的个数为：");
        return size(root);
    }

    public int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            //获取左子树的高度
            int lC = this.size(root.getLeftNode());
            //获取右子树的高度
            int rC = this.size(root.getRightNode());
            //返回左子树，右子树比较高的值再加一
            return lC + rC + 1;
        }
    }

    @Override
    public int getHeight() {
        System.out.println("二叉树的高度是");
        return getHeight(root);
    }

    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            //获取左子树的高度
            int lH = this.getHeight(root.getLeftNode());
            //获取右子树的高度
            int rH = this.getHeight(root.getRightNode());
            //返回左子树，右子树比较高的值再加一
            return lH > rH ? lH + 1 : rH + 1;
        }
    }

    @Override
    public Node findKey(Node node) {
        return null;
    }

    @Override
    public void preOrderTraverse() {
        if (root != null) {
            //输出根节点的值
            System.out.print(root.getObject() + " ");
            //对左子树进行先序遍历
            //创建左子树，根是左子树的跟
            BinaryTree leftTree = new LinkedBinaryTree(root.getLeftNode());
            leftTree.preOrderTraverse();
            //对右子树进行先序遍历
            //创建右子树，根是右子树的跟
            BinaryTree rightTree = new LinkedBinaryTree(root.getRightNode());
            rightTree.preOrderTraverse();
        }
    }

    @Override
    public void inOrderTraverse() {
        System.out.println("中序递归遍历");
        inOrderTraverse(root);
        System.out.println("");
    }

    private void inOrderTraverse(Node root) {
        if (root != null) {
            //对左子树进行中序遍历
            this.inOrderTraverse(root.getLeftNode());
            //输出根节点的值
            System.out.print(root.getObject() + " ");
            //对右子树进行中序遍历
            //创建右子树，根是右子树的跟
            this.inOrderTraverse(root.getRightNode());
        }
    }

    @Override
    public void postOrderTraverse() {
        System.out.println("后序递归遍历");
        postOrderTraverse(root);
        System.out.println("");
    }

    @Override
    public void postOrderTraverse(Node root) {
        if (root != null) {
            this.postOrderTraverse(root.getLeftNode());
            this.postOrderTraverse(root.getRightNode());
            System.out.print(root.getObject() + " ");
        }
    }


    @Override
    public void preOrderByStack() {

    }

    @Override
    public void inOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {

    }
}
