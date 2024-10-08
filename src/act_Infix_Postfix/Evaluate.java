package act_Infix_Postfix;

import java.util.Stack;

public class Evaluate {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
       
        String equation = "342*+9-";
       
        char[] current = equation.toCharArray();
       
        for(int i = 0; i < equation.length(); i++){
            if(isDigit(current[i])){
                stack.push(Character.getNumericValue(current[i]));
            }else{
                stack.push(result(stack, current[i]));
            }
           
        }

        System.out.println(equation + " = " + stack.peek());
       
    }
   
    static boolean isDigit(char a){
        char[] nums = {'0','1','2','3','4','5','6','7','8','9'};
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            if(a == nums[i]){
                found = true;
            }
        }
        return found;
    }
   
    static int result(Stack<Integer> stack, char op){
        int num1, num2, result;
       
        num1 = stack.peek();
        stack.pop();
        num2 = stack.peek();
        stack.pop();
       
        result = switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
       
        return result;
    }
}