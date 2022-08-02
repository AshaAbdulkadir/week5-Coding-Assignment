package week5CodingAssignment;

import java.util.Scanner;

public class App {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.print("Enter a word: ");
		String userInput = sc.nextLine();
		
		Logger logger = new AsteriskLogger();
		logger.log(userInput);
		
		
		System.out.println("*********************");
		Logger logger2 = new AsteriskLogger();
		logger2.error(userInput);
		System.out.println("*********************");
		
		
		
		Logger loggerSpace = new SpacedLogger();
		loggerSpace.log(userInput);
		loggerSpace.error(userInput);
		
	
		

		
		
	}

}
