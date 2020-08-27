package cn.algorithms.sort;

import java.util.Arrays;

/**
 * Insertion
 *
 * @author wang
 * @date 2020/8/27
 **/
public class Insertion {
    public static void sort(Comparable[] a){
        for (int i = 1; i <a.length ; i++) {
            for (int j = i ; j > 0 ; j--) {
                if (greater(a[j-1],a[j])){
                    exchange(a,j,j-1);
                }
            }
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
