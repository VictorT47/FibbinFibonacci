package palindromeAssignment;
import java.util.Scanner;
public class FibbinFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		System.out.print("Enter a word or 'done' to quit: ");
		String wordInput = scanner.nextLine();
		
		if (wordInput.equalsIgnoreCase("done")) {
		System.out.println("PalindromeChecker is PalinDone!!! (^w^)");
		break;
	}
		String lowercasedWord = wordInput.toLowerCase();
		boolean fibbinPalindrome = true;
		int wordLength = lowercasedWord.length();
		
		for (int i = 0; i < wordLength / 2; i++) {
		int leftCharValue = lowercasedWord.charAt(i) - 'a' + 1;
		int rightCharValue = lowercasedWord.charAt(wordLength - i - 1) - 'a' + 1;
		
		if (leftCharValue != rightCharValue) {
		fibbinPalindrome = false;
		break;
	}
}
		if (fibbinPalindrome) {
		System.out.println("The word " + wordInput + " is a palindrome.");	
		} else {
		System.out.println("The word " + wordInput + " is not a palindrome.");
	}
}
		scanner.close();
	}
}
