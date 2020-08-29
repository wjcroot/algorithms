package cn.algorithms.test;

import cn.algorithms.sort.Quick;

/**
 * QuickTest
 *
 * @author wang
 * @date 2020/8/28
 **/
public class QuickTest {
    public static void main(String[] args) {
        Integer[] a={6,1,2,7,9,3,5,4,8};
        Quick.sort(a);
        System.out.println(Quick.show(a));
    }
}
