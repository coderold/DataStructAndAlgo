package act_Infix_Postfix;

import java.util.Stack;

public class Convert {

	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<>();
		Stack<Character> postfix = new Stack<>();
		
		//String eq = "5*(6+7)";
		String eq = "(6/3+2)*(9-3)";
		char[] token = eq.toCharArray();
		
		for(int i = 0; i < eq.length(); i++) {
			if(isDigit(token[i])) {
				postfix.push(token[i]);
			}
			else if(isOperator(token[i])) {
				operator(stack, postfix, token[i]);
			}
			else if(token[i] == '(') {
				stack.push(token[i]);
			}
			else if(token[i] == ')') {
				popAll(stack, postfix);
			}
			
		}
		
		//kapag tapos na ang loop
		//if di pa empty ang stack
		//push and pop lahat sa postfix
		if(!stack.isEmpty()) {
			while(!stack.isEmpty()) {
				postfix.push(stack.peek());
				stack.pop();
			}
		}
			
		System.out.println(postfix);
	}
	
	static boolean isOperator(char a){
        char[] op = {'*','/','+','-'};
        boolean found = false;
        for(int i = 0; i < op.length; i++){
            if(a == op[i]){
                found = true;
            }
        }
        return found;
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
	
	static void operator(Stack<Character> stack, Stack<Character> postfix, char op) {
		if(!stack.isEmpty()) {
			if(stack.peek() == '(') {
				stack.push(op);
			}
			else if(compareOp(stack.peek(), op)){
				postfix.push(stack.peek());
				stack.pop();
				stack.push(op);
			}
			
		}else {
			stack.push(op);
		}
	}
	
	static boolean compareOp(char stackOp, char newOp) {
		if(opPrecedence(newOp) < opPrecedence(stackOp)) {
			return true;
		}else {
			return false;
		}
	}
	
	static int opPrecedence(char op) {
		return switch (op) {
        case '+' -> 1;
        case '-' -> 1;
        case '*' -> 2;
        case '/' -> 2;
        default -> 0;
		};
	}
	
	static void popAll(Stack<Character> stack, Stack<Character> postfix) {
		//method that will push every operator inside the stack to postfix
		//until it sees the ( parenthesis
		while(stack.peek() != '(') {
			postfix.push(stack.peek());
			stack.pop();
		}
		stack.pop();	
	}
	
}
