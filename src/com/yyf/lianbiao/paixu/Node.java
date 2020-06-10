package com.yyf.lianbiao.paixu;

/**
 * @Author: yyf
 * @Description:二叉树
 * @Date:in 2020/6/10 23:27
 **/

public class Node {
    private Object object;//节点值
    private Node leftNode;//左子树引用
    private Node rightNode;//右子树引用

    public Node(Object object) {
        this.object = object;
    }

    public Node(Object object, Node leftNode, Node rightNode) {
        this.object = object;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
