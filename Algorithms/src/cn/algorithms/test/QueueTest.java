package cn.algorithms.test;


import cn.algorithms.linear.Queue;

/**
 * QueueTest
 *
 * @author wang
 * @date 2020/9/3
 **/
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q=new Queue<String>();

        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");

        q.forEach(System.out::println);

        String result = q.dequeue();
        System.out.println(result);
        System.out.println(q.size());
    }
}
