package com.yyf.lianbiao.lianbiao;


import com.yyf.lianbiao.shunxubiao.List;

import java.util.Stack;

/**
 * @Author: yyf
 * @Description:
 * @Date:in 2020/5/27 23:02
 **/

public class SingleLinkedList implements List {

    private Node head = new Node();//头结点，不存储数据
    private int size;//一共有几个结点


    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i < 0 || i > size) {
            throw new RuntimeException("数组索引指针越界异常" + i);
        }
        //和顺序表不一样，不能通过索引直接定位计算，而需要从头结点开始遍历查找
        //找到前一个节点，从head节点开始找
        Node p = head;
        for (int j = 0; j <= i; j++) {
            p = p.getNext();
        }
        return p.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        //找到前一个节点，从head节点开始找
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.getNext();
        }
        //新创建一个节点
        Node node = new Node();
        node.setData(e);
        //指明新节点的后继节点
        node.setNext(p.getNext());
        //指明新节点的前驱节点
        p.setNext(node);
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size, e);
    }

    @Override
    public void addBefore(Object object, Object e) {

    }

    @Override
    public void addAfter(Object object, Object e) {

    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        Node p = head.getNext();
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                stringBuilder.append(p.getData() + ",");
            } else {
                stringBuilder.append(p.getData());
            }
            //移动指针到下一个节点
            p = p.getNext();
        }
        return stringBuilder.append("]").toString();
    }

    //反转整个连表 递归法
    public void reverse() {
        //判断当前连表是否为空链表，如果是空链表则结束运行，如果不是则需要调用重载的reverse方法完成反转
        if (isEmpty()) {
            return;
        }
        reverse(head.getNext());
    }

    //指定反转某个节点,并把反转后的节点返回
    public Node reverse(Node curr) {
        if (curr.getNext() == null) {
            head.setNext(curr);
            return curr;
        }
        //递归得反转curr的下一个节点，返回的值就是连表反转后的上一个节点
        Node pre = reverse(curr.getNext());
        //让返回的节点的下一个节点变为当前的节点
        pre.setNext(curr);
        //把当前节点的下一个节点变为null
        curr.setNext(null);
        return curr;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    //反转整个连表 头插法
    public void reverse2() {
        if (size == 0 || size == 1) {
            return;
        }
        Node cur = head.getNext();
        Node next;//指向当前节点（cur）的下一个节点
        Node reverseNode = new Node();
        //遍历原来的链表，每遍历一个就将其取出，并放在新的链表reverseNode的最前端
        while (cur != null) {
            next = cur.getNext();//保存当前节点的下一个节点,因为后面需要使用
            cur.setNext(reverseNode.getNext());
            reverseNode.setNext(cur);//将cur的下一个节点指向新的链表的最前端
            cur = next;
        }
        head.setNext(reverseNode.getNext());
    }

    //求单链表倒数第K个节点
    public Object getK(int k) {
        Node p = head;
        if (k <= 0 || k > size) {
            return null;
        }
        for (int i = 0; i < size - k + 1; i++) {
            p = p.getNext();
        }
        return p.getData();
    }

    //从尾到头打印单链表
    //利用栈这个数据结构，用它的先进后出的特点，就实现了逆序打印的功能
    public void reversePrint(Node node) {
        if (node.getNext() == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = head.getNext();
        while (cur != null) {
            stack.push(cur);
            cur = cur.getNext();//cur后移，这样就可以压入下一个节点
        }
        //将栈中的数据弹出
        while (stack.size() > 0) {
            System.out.println(stack.pop().getData());
        }
    }
}
