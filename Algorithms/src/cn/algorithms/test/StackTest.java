package cn.algorithms.test;

import cn.algorithms.linear.Stack;

/**
 * StackTest
 *
 * @author wang
 * @date 2020/9/2
 **/
public class StackTest {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        s.forEach(System.out::println);

        String result = s.pop();
        System.out.println("出栈元素：" + result);
        System.out.println("剩余元素个数：" + s.size());
    }
}
