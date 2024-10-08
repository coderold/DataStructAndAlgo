package act_Infix_Postfix;

import java.util.Stack;

public class Convert {

	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<>();
		Stack<Character> postfix = new Stack<>();
		
		String eq = "5*(6+7)";
		char[] token = eq.toCharArray();
		
		for(int i = 0; i < eq.length(); i++) {
			if(Evaluate.isDigit(token[i])) {
				postfix.push(token[i]);
			}
//			else if(token[i] == '') {
//				
//			}
		}
		
		//tulog muna po ako pls
		

	}

}
