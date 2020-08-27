package cn.algorithms.sort;

import java.util.Arrays;

/**
 * Bubble
 * 冒泡排序
 * @author wang
 * @date 2020/8/27
 **/
public class Bubble {
    /**
     * 对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a){
        for (int i = a.length-1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (greater(a[j],a[j+1])){
                    exchange(a,j,j+1);
                }
            }
        }
    }

    /**
     * 比较元素v w的大小
     */
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    /**
     * 元素i j交换位置
     */
    public static void exchange(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static String show(Comparable[] a){
        return Arrays.toString(a);
    }
}
