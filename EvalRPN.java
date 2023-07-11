import java.util.Stack;

public class EvalRPN {
    public static int evalRPN(String[] tokens) {
     
        Stack<String> stack = new Stack<>();

        for (String element : tokens) {

            if (element == "+" || element == "-" || element == "*" || element == "/") { // YOU HAVE TO MAKE .equals INSTEAD OF ==
                int operand2 = Integer.parseInt(stack.pop());
                int operand1 = Integer.parseInt(stack.pop());

                if (element == "+") {
                    stack.push(Integer.toString(operand1 + operand2));
                } else if (element == "-") {
                    stack.push(Integer.toString(operand1 - operand2));
                } else if (element == "*") {
                    stack.push(Integer.toString(operand1 * operand2));
                } else {
                    stack.push(Integer.toString(operand1 / operand2));
                }
            } else {
                stack.push(element);
            }
        }
        System.out.println(stack);
        return Integer.parseInt(stack.pop());
    }
}
