package com.mgleetcode.stack.easy;

import java.util.Stack;

public class LC20_Valid_Parentheses {

    public static void main(String[] args) {
        LC20_Valid_Parentheses obj = new LC20_Valid_Parentheses();
        String s = "([])";
        System.out.println(obj.isValid(s));
    }

    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.peek();
                if ((c=='}' && top == '{') || (c==']' && top == '[') || (c==')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
