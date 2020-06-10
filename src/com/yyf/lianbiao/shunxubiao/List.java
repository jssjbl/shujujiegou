package com.yyf.lianbiao.shunxubiao;

/**
 * @Author: yyf
 * @Description: 线性表接口 和 实现方式无关
 * @Date:in 2020/6/1 20:07
 **/

public interface List {
    //返回线性表的大小，即数组元素的个数
    int size();

    //返回线性表中下标为i的元素
    Object get(int i);

    //如果线性表为空返回true，否则为false
    boolean isEmpty();

    //判断线性表中是否包含元素e
    boolean contains(Object e);

    //返回数据元素e在线性表中的下标
    int indexOf(Object e);

    //将数据元素e插入到下表为i的位置
    void add(int i, Object e);

    //将数据元素插入到线性表的末尾
    void add(Object e);

    //将数据元素插入到元素e之前，
    void addBefore(Object object, Object e);

    //将数据元素插入到元素e之后，
    void addAfter(Object object, Object e);

    //删除线性表中下标为i的元素，并返回
    Object remove(int i);

    //删除线性表中第一个与e相同的元素
    boolean remove(Object e);

    //替换线性表中序号为i的元素e,并返回
    Object replace(int i, Object e);

}
