
package Queuee;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MovieTime {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Queue<String> movies = new LinkedList<>();
		Queue<String> snacks = new LinkedList<>();

		askInput(movies, "movie");
		System.out.println();
		askInput(snacks, "snack");
		
		System.out.println("\nMovies: " + movies);
		System.out.println("Snacks: " + snacks + "\n");
		
		kaininAng(snacks);

	}
	
	static void askInput(Queue<String> queue, String tawag) {
		for(int i = 1; i <= 3; i++) {
			System.out.print("Enter " + tawag + " " + i + " of 3: ");
			queue.offer(input.nextLine());
		}
	}
	
	static void kaininAng(Queue<String> kakainin) {
		while(!kakainin.isEmpty()) {
			System.out.println("Press S each time you finish a snack.");
			if(input.nextLine().equalsIgnoreCase("s")) {
				kakainin.poll();
				System.out.println("Snacks: " + kakainin);
			}
		}
		System.out.println("No more Snacks");
	}

}

