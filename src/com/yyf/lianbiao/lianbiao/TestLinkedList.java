package com.yyf.lianbiao.lianbiao;

import com.yyf.lianbiao.shunxubiao.List;

/**
 * @Author: yyf
 * @Description:
 * @Date:in 2020/6/1 20:23
 **/

public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add("我");
        list.add("是");
        list.add("一");
        list.add("个");
        list.add("大");
        list.add("神");
//        list.add(3,666);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.get(3));
        System.out.println("====原链表为====");
        System.out.println(list.toString());
        System.out.println("====递归反转后=====");
        list.reverse();
        System.out.println(list.toString());

        System.out.println("====头插法反转====");
        list.reverse2();
        System.out.println(list.toString());

        System.out.println("====求链表倒数第k个节点值====");
        System.out.println(list.getK(2));

        System.out.println("====从尾到头打印单链表====");
        list.reversePrint(list.getHead());
    }

}
