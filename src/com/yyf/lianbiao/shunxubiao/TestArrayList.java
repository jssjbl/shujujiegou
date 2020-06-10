package com.yyf.lianbiao.shunxubiao;

/**
 * @Author: yyf
 * @Description:
 * @Date:in 2020/6/1 20:23
 **/

public class TestArrayList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(123);
        list.add(132);
        list.add(321);
        list.add(312);
        list.add(213);
        list.add(231);
        list.add(3,666);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list);

    }
}
