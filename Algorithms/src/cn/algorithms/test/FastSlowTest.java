package cn.algorithms.test;



/**
 * FastSlowTest
 * 快慢指针
 * @author wang
 * @date 2020/9/1
 **/
public class FastSlowTest {
    public static void main(String[] args) {
        Node<String> first=new Node<>("a",null);
        Node<String> second=new Node<>("b",null);
        Node<String> third=new Node<>("c",null);
        Node<String> fourth=new Node<>("d",null);
        Node<String> fifth=new Node<>("e",null);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=third;
        System.out.println(getEntrance(first).t);
    }

    private static String getMid(Node<String> first){
        Node<String> fast=first;
        Node<String> slow=first;
        while (fast!=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.t;
    }

    private static boolean isCircle(Node<String> first){
        Node<String> fast=first;
        Node<String> slow=first;
        while (fast!=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;

            if (fast.equals(slow)){
                return true;
            }
        }
        return false;
    }

    private static Node getEntrance(Node<String> first){
        Node<String> fast=first;
        Node<String> slow=first;
        Node<String> temp=null;
        while (fast!=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;

            if (fast.equals(slow)){
                temp=first;
                continue;
            }
            if (temp != null){
                temp=temp.next;
                if (temp.equals(slow)){
                    break;
                }
            }
        }
        return temp;
    }



    public static class Node<T>{
        private T t;
        private Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }
    }
}
