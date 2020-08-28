package cn.algorithms.sort;

import java.util.Arrays;

/**
 * Shell
 *
 * @author wang
 * @date 2020/8/27
 **/
public class Shell {
    public static void sort(Comparable[] a){
        int h=1;
        while (h<a.length/3){
            h=h*3+1;
        }
        while (h>=1){
            for (int i = h; i < a.length ; i++) {
                for (int j = i; j >=h ; j-=h) {
                    if (greater(a[j-h],a[j])){
                        exchange(a,j-h,j);
                    }else {
                        break;
                    }
                }
            }
            h=h/3;
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
