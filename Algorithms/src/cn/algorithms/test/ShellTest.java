package cn.algorithms.test;

import cn.algorithms.sort.Shell;


/**
 * ShellTest
 *
 * @author wang
 * @date 2020/8/27
 **/
public class ShellTest {
    public static void main(String[] args) {
        Integer[] a={9,1,2,5,7,4,8,6,3,5};
        Shell.sort(a);
        System.out.println(Shell.show(a));
    }

}
