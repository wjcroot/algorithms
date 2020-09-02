package cn.algorithms.linear;

import java.util.Iterator;

/**
 * Stack
 *
 * @author wang
 * @date 2020/9/2
 **/
public class Stack<T> implements Iterable<T> {

    private class Node {
        private T item;
        private Node next;

        private Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head;
    private int N;

    public Stack() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(T item) {
        Node oldFirst = head.next;
        Node newNode = new Node(item, null);
        head.next = newNode;
        newNode.next = oldFirst;
        N++;
    }

    public T pop() {
        Node oldFirst = head.next;
        if (oldFirst == null) {
            return null;
        }
        head.next = oldFirst.next;
        N--;
        return oldFirst.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator {

        private Node n;

        private SIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }
}
