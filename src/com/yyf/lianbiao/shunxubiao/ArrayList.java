package com.yyf.lianbiao.shunxubiao;

import java.util.Arrays;

/**
 * @Author: yyf
 * @Description: 模拟实现顺序表，底层采用数组，但是长度可以动态变化
 * @Date:in 2020/6/1 20:21
 **/

public class ArrayList implements List {

    private Object[] elementData;//底层是一个数值，目前还没有确定长度
    private int size; // 不是数组分配了多少空间，而是元素的个数

    /**
     * 功能描述: <br>
     * <p>
     * 参数: [initialCapacity] 指定数组的初始长度
     * 返回值:
     * 作者: yyf
     * 时间: 2020/6/1 20:27
     */
    public ArrayList(int initialCapacity) {
        //给数组分配指定数量的空间
        elementData = new Object[initialCapacity];
        //指定顺序表的元素个数,默认为0
        size = 0;
    }

    public ArrayList() {
        //没有指定长度，默认长度为4
        this(4);
        //没有指定长度，长度为0
//        elementData = new Object[]{};
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i < 0 || i >= size) {
            throw new RuntimeException("数组索引指针越界异常" + i);
        }
        return elementData[i];
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
        //如果数组满了就扩容
        if (size == elementData.length) {
            grow();
        }
        //后移元素，i及其后面的元素
        for (int j = size; j > i; j--) {
            elementData[j] = elementData[j - 1];
        }
        //给数据的第i个元素赋值
        elementData[i] = e;
        //元素个数加一
        size++;
    }

    @Override
    public void add(Object e) {
//        //如果数组满了就扩容
//        if (size == elementData.length) {
//            grow();
//        }
//        //添加到数组末尾
//        elementData[size] = e;
//        //元素个数加一
//        size++;
//        //以上两步可以合为一步
////        elementData[size++] = e;
        this.add(size, e);
    }

    /**
     * 功能描述: <br> 扩容方法
     * <p>
     * 参数: []
     * 返回值: void
     * 作者: yyf
     * 时间: 2020/6/1 21:13
     */
    private void grow() {
        //新创建一个数组，长度是旧数组的两倍
        Object[] newArray = new Object[elementData.length * 2];
        //将旧数组的数据迁移至新数组
        for (int i = 0; i < size; i++) {
            newArray[i] = elementData[i];
        }
        //让elementData指向新数组
        elementData = newArray;

        //以上操作可以用以下方法代替
//            elementData = Arrays.copyOf(elementData, elementData.length * 2);
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
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                stringBuilder.append(elementData[i] + ",");
            } else {
                stringBuilder.append(elementData[i]);
            }

        }
        return stringBuilder.append("]").toString();
    }
}
