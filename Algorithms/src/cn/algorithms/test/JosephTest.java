package cn.algorithms.test;

/**
 * JosephTest
 *
 * @author wang
 * @date 2020/9/1
 **/
public class JosephTest {
    public static void main(String[] args) {
        Node<Integer> first = null;
        Node<Integer> pre = null;
        for (int i = 1; i <= 41; i++) {
            // 如果是第一个节点
            if (i == 1) {
                first = new Node<>(i, null);
                pre=first;
                continue;
            }
            Node<Integer> newNode = new Node<>(i, null);
            pre.next = newNode;
            pre = newNode;
            // 最后一个节点
            if (i == 41) {
                pre.next = first;
            }
        }

        int count=0;
        // 当前节点
        Node<Integer> n=first;
        // 单签节点的前一个节点
        Node<Integer> before=null;
        while (n.next != n){
            count++;
            if (count == 3){
                System.out.print(n.item+"-");
                before.next=n.next;
                n=n.next;
                count=0;
            }else{
                before=n;
                n=n.next;
            }
        }

        System.out.println(n.item);
    }


    private static class Node<T> {
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
