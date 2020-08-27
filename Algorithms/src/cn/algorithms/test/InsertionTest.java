package cn.algorithms.test;

import cn.algorithms.sort.Insertion;

/**
 * InsertionTest
 * 插入排序
 * @author wang
 * @date 2020/8/27
 **/
public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a={1,3,5,4,2,66};
        Insertion.sort(a);
        System.out.println(Insertion.show(a));
    }
}
