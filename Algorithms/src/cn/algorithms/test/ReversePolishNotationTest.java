package cn.algorithms.test;

import cn.algorithms.linear.Stack;

/**
 * ReversePolishNotationTest
 * 逆波兰表达式
 *
 * @author wang
 * @date 2020/9/2
 **/
public class ReversePolishNotationTest {
    public static void main(String[] args) {
        String[] notation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        int result = calculator(notation);
        System.out.println(result);
    }

    private static int calculator(String[] notation) {
        Stack<Integer> operand = new Stack<>();
        Integer o1;
        Integer o2;
        Integer result;
        for (String s : notation) {
            switch (s) {
                case "+":
                    o1 = operand.pop();
                    o2 = operand.pop();
                    result = o2 + o1;
                    operand.push(result);
                    break;
                case "-":
                    o1 = operand.pop();
                    o2 = operand.pop();
                    result = o2 - o1;
                    operand.push(result);
                    break;
                case "*":
                    o1 = operand.pop();
                    o2 = operand.pop();
                    result = o2 * o1;
                    operand.push(result);
                    break;
                case "/":
                    o1 = operand.pop();
                    o2 = operand.pop();
                    result = o2 / o1;
                    operand.push(result);
                    break;
                default:
                    operand.push(Integer.parseInt(s));
                    break;
            }
        }
        return operand.pop();
    }
}
