import java.util.Scanner;

public class Week7P1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a word: ");
			String word = in.nextLine();
			
		String wordBackwards = "";
		
		for (int i = word.length();i > 0;i--) {
				wordBackwards += word.substring(i-1, i);
		}
		
		if (word.equalsIgnoreCase(wordBackwards)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		in.close();
	}
}
