package com.yyf.lianbiao.lianbiao;

/**
 * @Author: yyf
 * @Description:单链表的结点
 * @Date:in 2020/5/27 22:52
 **/

public class Node {
    private Object data;//要存储的数据
    private Node next;

    public Node() {
    }

    public Node(Object data) {
        super();
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //单链表逆置
    public static void main(String[] args) {
        int[] yuan = new int[]{1, 3, 4, 5, 8};
        Node head = new Node();

    }
}
