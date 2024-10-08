package Stackss;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MovieTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<String> movies = new LinkedList<>();
		Queue<String> snacks = new LinkedList<>();

		for(int i = 1; i <= 3; i++) {
		System.out.print("Enter movie " + i + " of 3: ");
		String movie = input.nextLine();
		movies.offer(movie);
		}
		
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("Enter snack" + i + " of 3: ");
			String snack = input.nextLine();
			snacks.offer(snack);
		}
		
		System.out.println("Movies: " + movies);
		System.out.println("Snacks: " + snacks);
		
		while(!snacks.isEmpty()) {
			System.out.println("Press S each time you finish a snack.");
			if(input.nextLine().equalsIgnoreCase("s")) {
				snacks.poll();
				System.out.println("Snacks: " + snacks);
			}
		}
		if(snacks.isEmpty()) {
			System.out.println("No more snacks");
		}
		
		input.close();
	}

}