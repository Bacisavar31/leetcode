import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        char[] string = s.toCharArray();

        for (char element : string) {

            if (element == '(' || element == '[' || element == '{') {
                stack.push(element);
            } else {
                if (stack.empty()) {
                    return false;
                }

                if (map.get(stack.peek()) == element) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        return stack.empty();

    }

}