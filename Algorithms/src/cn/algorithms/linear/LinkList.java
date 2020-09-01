package cn.algorithms.linear;

import java.util.Iterator;

/**
 * LinkList
 * 单链表
 *
 * @author wang
 * @date 2020/8/30
 **/
public class LinkList<T> implements Iterable<T> {
    private Node head;
    private int N;

    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public void clear() {
        head.next = null;
        this.N = 0;
    }

    public int length() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public T get(int i) {
        if (head.next != null) {
            Node n = head.next;
            for (int index = 0; index < i; index++) {
                n = n.next;
            }
            return n.item;
        }
        return null;
    }

    public void insert(T t) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        Node newNode = new Node(t, null);
        n.next = newNode;
        N++;
    }

    public void insert(int i, T t) {
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        Node current = pre.next;
        Node newNode = new Node(t, current);
        pre.next = newNode;
        N++;
    }

    public T remove(int i) {
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        Node current = pre.next;
        pre.next = current.next;
        N--;
        return current.item;
    }

    public int indexOf(T t) {
        Node n = head;
        for (int i = 0; n.next != null; i++) {
            n = n.next;
            if (n.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 单链表反转
     */
    public void reverse() {
        if (isEmpty()) return;
        reverse(head.next);
    }

    private Node reverse(Node curr) {
        if (curr.next == null) {
            head.next = curr;
            return curr;
        }
        Node pre = reverse(curr.next);
        pre.next = curr;
        curr.next = null;
        return curr;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    public class LIterator implements Iterator {

        private Node n;

        public LIterator() {
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
