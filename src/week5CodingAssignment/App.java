package week5CodingAssignment;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String userInput = sc.nextLine();
		
		Logger logger = new AsteriskLogger();
		logger.log(userInput);
	}

}
