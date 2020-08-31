package cn.algorithms.linear;

import java.util.Iterator;

/**
 * TwoWayLinkListTest
 *
 * @author wang
 * @date 2020/8/31
 **/
public class TwoWayLinkList<T> implements Iterable<T> {

    private class Node {
        private T item;
        private Node pre;
        private Node next;

        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }

    /**
     * 头结点：head
     * 尾结点：last
     * 节点的个数：n (不包括头结点)
     */
    private Node head;
    private Node last;
    private int n;

    public TwoWayLinkList() {
        this.head = new Node(null, null, null);
        this.last = null;
    }

    /**
     * 清空链表
     */
    public void clear() {
        this.head.next = null;
        this.last = null;
        this.n = 0;
    }

    public int length() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public T get(int i) {
        if (isEmpty()) return null;
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    /**
     * 获取第一个节点的数据
     */
    public T getFirst() {
        if (isEmpty()) return null;
        return head.next.item;
    }

    /**
     * 获取最后一个节点的数据
     */
    public T getLast() {
        if (isEmpty()) return null;
        return last.item;
    }

    public void insert(T t) {
        if (isEmpty()) {
            Node newNode = new Node(t, head, null);
            head.next = newNode;
            last = newNode;
        } else {
            Node oldLast = last;
            Node newNode = new Node(t, oldLast, null);
            oldLast.next = newNode;
            last = newNode;
        }
        n++;
    }

    public void insert(int i, T t) {
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node newNode = new Node(t, pre, curr);
        pre.next = newNode;
        curr.pre = newNode;
        n++;
    }

    public int indexOf(T t) {
        Node n = head.next;
        for (int index = 0; n.next != null; index++) {
            if (n.item.equals(t)) {
                return index;
            }
            n = n.next;
        }
        return -1;
    }

    public T remove(int i) {
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node nextNode = curr.next;
        pre.next = nextNode;
        nextNode.pre = pre;
        n--;
        return curr.item;
    }

    @Override
    public Iterator iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator {
        private Node n;

        public TIterator() {
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
