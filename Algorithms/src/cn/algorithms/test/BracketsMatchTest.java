package cn.algorithms.test;

import cn.algorithms.linear.Stack;

/**
 * BracketsMatchTest
 * 括号匹配
 *
 * @author wang
 * @date 2020/9/2
 **/
public class BracketsMatchTest {
    public static void main(String[] args) {
        String str = "(1+2+(2*3))";
        boolean match = isMatch(str);
        System.out.println(match);
    }

    private static boolean isMatch(String str) {

        Stack<String> chars = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String curr = str.charAt(i) + "";
            if ("(".equals(curr)) {
                chars.push(curr);
            } else if (")".equals(curr)) {
                String result = chars.pop();
                if (result == null) {
                    return false;
                }
            }
        }
        return chars.size() == 0;
    }
}
