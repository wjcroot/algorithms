package cn.algorithms.test;

import cn.algorithms.sort.Merge;

/**
 * MergeTest
 *
 * @author wang
 * @date 2020/8/28
 **/
public class MergeTest {
    public static void main(String[] args) {
        Integer[] a={8,4,5,7,1,3,6,2};
        Merge.sort(a);
        System.out.println(Merge.show(a));

    }

}
