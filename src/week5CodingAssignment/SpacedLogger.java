package week5CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println( userInput(log)); // created method for userInput
		
		
	}

	private String userInput(String userInput) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < userInput.length(); i++) {
			if (i < userInput.length()-1) {
				result.append(userInput.charAt(i));
				result.append(" ");
			} else {
				result.append(userInput.charAt(i));
			}
		}
			
			return result.toString();
	
	}

	@Override
	public void error(String error) {
		
		
	}



	
	

}
