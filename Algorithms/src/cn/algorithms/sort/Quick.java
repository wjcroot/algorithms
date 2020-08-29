package cn.algorithms.sort;

import java.util.Arrays;

/**
 * Quick
 * 快速排序
 *
 * @author wang
 * @date 2020/8/28
 **/
public class Quick {
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    private static void exchange(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void sort(Comparable[] a){
        int lo=0;
        int hi=a.length-1;
        sort(a,lo,hi);
    }

    public static void sort(Comparable[] a,int lo,int hi){
        if (hi<=lo){
            return;
        }
        int partition=partition(a,lo,hi);

        sort(a,lo,partition-1);
        sort(a,partition+1,hi);

    }

    private static int partition(Comparable[] a,int lo,int hi){
        Comparable key=a[lo];
        int left=lo;
        int right=hi+1;
        while (true){
            if (left>=right){
                break;
            }
            while (less(key,a[--right])){
                if (right==lo){
                    break;
                }
            }
            while (less(a[++left],key)){
                if (left==right){
                    break;
                }
            }
            exchange(a,left,right);
        }
        exchange(a,lo,right);

        return  right;
    }

    public static String show(Comparable[] a){
        return Arrays.toString(a);
    }
}
