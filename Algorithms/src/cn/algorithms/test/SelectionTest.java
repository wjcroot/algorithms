package cn.algorithms.test;

import cn.algorithms.sort.Selection;

/**
 * SelectionTest
 *
 * @author wang
 * @date 2020/8/27
 **/
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a={9,2,4,7,5,0};
        Selection.sort(a);
        System.out.println(Selection.show(a));
    }
}
