package cn.algorithms.linear;

import java.util.Iterator;

/**
 * SequenceList
 *
 * @author wang
 * @date 2020/8/29
 **/
public class SequenceList<T> implements Iterable<T> {
    private T[] eles;
    private int n;
    private int capacity;

    public SequenceList(int capacity) {
        this.eles = (T[]) new Object[capacity];
        this.n = 0;
        this.capacity = capacity;
    }

    /**
     * 数组元素个数
     */
    public int length() {
        return n;
    }

    /**
     * 判断数组是否为空
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * 将数组置为空数组
     */
    public void clear() {
        this.n = 0;
        this.eles = (T[]) new Object[capacity];
    }

    public T get(int i) {
        return eles[i];
    }

    /**
     * 添加元素
     */
    public void insert(T t) {
       if (n==eles.length){
           resize(2*eles.length);
       }
        eles[n++] = t;
    }

    /**
     * 添加元素到指定索引处
     */
    public void insert(int i, T t) {
        if (n==eles.length){
            resize(2*eles.length);
        }
        for (int index = n; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        eles[i] = t;
        n++;
    }

    /**
     * 移除指定索引处的元素
     */
    public T remove(int i) {
        T current = eles[i];
        for (int index = i; index < n-1; index++) {
            eles[index] = eles[index + 1];
        }
        n--;
        if (n<eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }

    /**
     * 数组扩容
     */
    public void resize(int newSize){
        T[] temp=eles;
        eles=(T[])new Object[newSize];
        for (int index = 0; index <n ; index++) {
            eles[index]=temp[index];
        }
    }

    /**
     * 查看元素第一次出现时的索引
     */
    public int indexOf(T t) {
        for (int i = 0; i < n; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIteraror();
    }

    public class SIteraror implements Iterator {

        private int custor;

        @Override
        public boolean hasNext() {
            return custor<n;
        }

        @Override
        public Object next() {
            return eles[custor++];
        }
    }
}
