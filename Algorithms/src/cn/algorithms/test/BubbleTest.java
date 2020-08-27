package cn.algorithms.test;

import cn.algorithms.sort.Bubble;


/**
 * BubbleTest
 *
 * @author wang
 * @date 2020/8/27
 **/
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] a={5,4,3,-2,-1,0};
        Bubble.sort(a);
        System.out.println("排序后的数组："+ Bubble.show(a));
    }
}
