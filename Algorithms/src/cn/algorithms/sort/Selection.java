package cn.algorithms.sort;

import java.util.Arrays;

/**
 * Selection
 * 选择排序
 * @author wang
 * @date 2020/8/27
 **/
public class Selection {
    public static void sort(Comparable[] a){
        for (int i = 0; i <= a.length-2 ; i++) {
            int minIndex=i;
            for (int j = i+1; j <a.length ; j++) {
                if (greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            exchange(a,minIndex,i);
        }
    }

    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

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
