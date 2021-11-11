import java.util.Stack;

class VPSolution2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(
//            new VPSolution1().isValid("()")
//            new VPSolution1().isValid("()[]{}")
//            new VPSolution1().isValid("(]")
//            new VPSolution1().isValid("([)]")
//            new VPSolution1().isValid("{[]}")
//            new VPSolution1().isValid("((")
            new VPSolution2().isValid("]")
        );
    }
}
