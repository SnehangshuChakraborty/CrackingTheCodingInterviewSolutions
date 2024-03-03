package RecursionAndDP;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {

    public static void main(String args[]){
        String expression = "{[()]}";
        System.out.print(validateParenthesis(expression));
    }

    public static boolean validateParenthesis(String expression){
        Deque<Character> stack = new ArrayDeque<>();

        for(char element: expression.toCharArray()){

            if(element == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            } else if(element == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            } else if(element == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            } else {
                if(element == '(' || element == '['||element == '{'||element == '}'||element == ']'|| element == ')' ){
                    stack.push(element);
                }
            }
        }
        return stack.isEmpty();
    }
}
