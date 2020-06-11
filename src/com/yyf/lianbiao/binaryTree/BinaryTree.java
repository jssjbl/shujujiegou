package com.yyf.lianbiao.binaryTree;

/**
 * @Author: yyf
 * @Description:二叉树的接口
 * 可以有不同的实现类，每个类可以使用不同的存贮结构，比如顺序存贮结构，链式存贮结构
 * @Date:in 2020/6/11 20:48
 **/

public interface BinaryTree {
    /**
     * 功能描述: <br>是否空树
     * 
     * 参数:
     * 返回值: 
     * 作者: yyf
     * 时间: 2020/6/11 20:50
     */
     boolean isEmpty();
     /**
      * 功能描述: <br> 数的节点数量
      *
      * 参数: []
      * 返回值: int
      * 作者: yyf
      * 时间: 2020/6/11 20:51
      */
     int size();
     /**
      * 功能描述: <br>获取二叉树的高度
      *
      * 参数: []
      * 返回值: int
      * 作者: yyf
      * 时间: 2020/6/11 20:51
      */
     int getHeight();
     /**
      * 功能描述: <br>查询指定值的节点
      *
      * 参数: [node]
      * 返回值: com.yyf.lianbiao.binaryTree.Node
      * 作者: yyf
      * 时间: 2020/6/11 20:52
      */
     Node findKey(Node node);
     /**
      * 功能描述: <br>前序递归遍历
      *
      * 参数: []
      * 返回值: void
      * 作者: yyf
      * 时间: 2020/6/11 20:54
      */
     void preOrderTraverse();
    /**
     * 功能描述: <br>中序递归遍历
     *
     * 参数: []
     * 返回值: void
     * 作者: yyf
     * 时间: 2020/6/11 20:54
     */
    void inOrderTraverse();
    /**
     * 功能描述: <br>后序递归遍历
     *
     * 参数: []
     * 返回值: void
     * 作者: yyf
     * 时间: 2020/6/11 20:54
     */
    void postOrderTraverse();
    /**
     * 功能描述: <br>后序递归遍历
     *
     * 参数: []
     * 返回值: void
     * 作者: yyf
     * 时间: 2020/6/11 20:54
     */
    void postOrderTraverse(Node node);
    /**
     * 功能描述: <br>前序遍历非递归操作
     * 1）对于任意节点current，若该节点不为空则访问该节点后再将节点压栈，并将左子树节点置位current，重复此操作，直到
     * 2）若左子树为空，则栈顶节点出栈，将该节点的右子树置为current
     * 3）重复1，2操作，直到current为空并且栈内节点为空
     *
     * 参数: []
     * 返回值: void
     * 作者: yyf
     * 时间: 2020/6/11 20:56
     */
    void preOrderByStack();
    /**
     * 功能描述: <br>中序遍历非递归操作
     * 1）对于任意节点current，若该节点不为空则将该节点压栈，并将左子树节点置位current，并将左子树节点置为current，
     * 2）若左子树为空，则栈顶节点出栈，访问该节点后将该节点的右子树置为current
     * 3）重复1，2操作，直到current为空并且栈内节点为空
     *
     * 参数: []
     * 返回值: void
     * 作者: yyf
     * 时间: 2020/6/11 20:56
     */
    void inOrderByStack();
    /**
     * 功能描述: <br>后序遍历非递归操作
     * 1）对于任意节点current，若该节点不为空则访问该节点后再节点压栈，并将左子树节点置为current，
     * 2）若左子树为空，取栈顶节点的右子树，如果右子树为空或者右子树刚访问过，则访问该节点，并将preNode置为该
     * 3）重复1，2操作，直到current为空并且栈内节点为空
     *
     * 参数: []
     * 返回值: void
     * 作者: yyf
     * 时间: 2020/6/11 20:56
     */
    void postOrderByStack();
    /**
     * 功能描述: <br>按照层次遍历二叉树
     *需要借助队列
     * 参数: []
     * 返回值: void
     * 作者: yyf
     * 时间: 2020/6/11 21:07
     */
    void  levelOrderByStack();

}
