import java.util.Stack;

class VPSolution1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            try {
                if (s.charAt(i) == ')') {
                if (stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            }
                if (s.charAt(i) == ']') {
                if (stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            }
                if (s.charAt(i) == '}') {
                if (stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            }
            } catch (Exception e) {
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(
//            new VPSolution1().isValid("()")
//            new VPSolution1().isValid("()[]{}")
//            new VPSolution1().isValid("(]")
//            new VPSolution1().isValid("([)]")
//            new VPSolution1().isValid("{[]}")
//            new VPSolution1().isValid("((")
            new VPSolution1().isValid("]")
        );
    }
}
