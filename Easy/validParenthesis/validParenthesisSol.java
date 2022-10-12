package Easy.validParenthesis;

import java.util.Stack;

/**
 * Submitted: 10/12/2022
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[', ']', determine if the input string is valid.
 * An input string is valid if:
 *      1. Open brackets must be close by the same type of brackets.
 *      2. Open brackets must be closed in the correct order.
 *      3. Every close bracket has a corresponding open bracket of the same type.
 * 
 * Time: O(1)
 * Space: O(1)
 */

public class validParenthesisSol {
    public static void main(String[] args) {
        /**
         * Example 1
         */
        String s = "()";
        System.out.println(isValid(s));
        

        s = "()[]{}";
        System.out.println(isValid(s));


        s = "(]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();     // Stack to store our brackets

        for (char c : s.toCharArray()) {
            if(c == '(') stack.push(')');                           // if '(' then we should have ')'
            else if (c == '{') stack.push('}');                     // if '{' then we should have '}'
            else if (c == '[') stack.push(']');                     // if '[' then we should have ']'
            else if (stack.isEmpty() || stack.pop() != c) return false;  // if the stack is empty or top of stack isnt equal to our char then return false
        }

        return stack.isEmpty();     // Should be empty when it gets here (return true) but just to be sure
    }
}
