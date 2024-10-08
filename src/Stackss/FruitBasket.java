package Stackss;

import java.util.Stack;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        Stack<String> fruits = new Stack<>();
        
        System.out.println("Catch and eat any of these fruits: ('apple', 'orange', 'mango', 'guava')");
        System.out.print("Enter how many fruits you would like to catch? ");
        
        int num = input.nextInt();
        System.out.println();
        
        for (int i = 1; i < num + 1; i++) {
        System.out.print("Choose a fruit to catch (A = Apple) (O = Orange) (M = Mango) (G = Guava): ");
        char fruit = Character.toUpperCase(input.next().charAt(0));
        
        switch (fruit) {
            case 'A':
                System.out.println("Fruits " + i + " of " + num + " are available");
                fruits.push("Apple");
                break;
            case 'O':
                System.out.println("Fruits " + i + " of " + num + " are available");
                fruits.push("Orange");
                break;
            case 'M':
                System.out.println("Fruits " + i + " of " + num + " are available");
                fruits.push("Mango");
                break;
            case 'G':
                System.out.println("Fruits " + i + " of " + num + " are available");
                fruits.push("Guava");
                break;
            }
        }
        
        System.out.println();
        
	    for (int i = 0; i < num; i++) {
	        System.out.println("Your basket has now: " + fruits);
	        System.out.print("Press E to eat a fruit. ");
	        char eat = Character.toUpperCase(input.next().charAt(0));
	            
	        if (eat == 'E') {
	            System.out.println("You ate: " + fruits.pop());
	            if (fruits.isEmpty()) {
	            System.out.println("No more fruits");
	                break;
	            }
	        }
        }
	    
	    input.close();
	    
	}
}
