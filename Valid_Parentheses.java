import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "({{[}]})";

        System.out.println(Boolean.toString(Solution(s)));
    }

    private static boolean Solution(String s) {
        Stack<Character> stk = new Stack();
        char top = '0';
        stk.push(top);
        for (char c : s.toCharArray()) {
            System.out.println(stk);
            if (c == '[') {
                stk.push('[');
            } else if (c == ']') {
                if (top == '[') {
                    stk.pop();
                } else {
                    return false;
                }
            } else if (c == '{') {
                stk.push('{');
            } else if (c == '}') {
                if (top == '{') {
                    stk.pop();
                } else {
                    return false;
                }
            } else if (c == '(') {
                stk.push('(');
            } else if (c == ')') {
                if (top == '(') {
                    stk.pop();
                } else {
                    return false;
                }
            }
            top = stk.peek();
        }
        if (stk.peek() == '0') {
            return true;
        } else {
            return false;
        }

    }

}
