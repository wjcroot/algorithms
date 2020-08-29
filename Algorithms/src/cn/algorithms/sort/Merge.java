package cn.algorithms.sort;

import java.util.Arrays;

/**
 * Merge
 * 归并排序
 * @author wang
 * @date 2020/8/28
 **/
public class Merge {
    private static Comparable[] assist;

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    public static void exchange(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    /**
     * 对数组a进行元素排序
     */
    public static void sort(Comparable[] a){
        assist=new Comparable[a.length];
        int lo=0;
        int hi=a.length-1;
        sort(a,lo,hi);
    }

    /**
     * 对数组a从索引lo到hi的元素进行排序
     */
    public static void sort(Comparable[] a,int lo,int hi){
        if (hi<=lo){
            return;
        }
        int mid=lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    public static void merge(Comparable[] a,int lo,int mid,int hi){
        int i=lo;
        int p1=lo;
        int p2=mid+1;
        while (p1<=mid&&p2<=hi){
            if (less(a[p1],a[p2])){
                assist[i++]=a[p1++];
            }else{
                assist[i++]=a[p2++];
            }
        }
        while (p1<=mid){
            assist[i++]=a[p1++];
        }
        while (p2<=hi){
            assist[i++]=a[p2++];
        }

        for (int index = lo; index <=hi ; index++) {
            a[index]=assist[index];
        }
    }

    public static String show(Comparable[] a){
        return Arrays.toString(a);
    }
}
