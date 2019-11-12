import java.util.Scanner;
public class Palindrome {
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase().replace(" ", "");
		if(s.length() == 0 || s.length() == 1) {
			return true;
		}
		else if(s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPalindrome(s.substring(1, s.length() - 1 ));
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("\nEnter a String (e.g. madam): ");
			String string = input.nextLine();
			if(isPalindrome(string)) {
				System.out.println(string + " is a Palindrome!");
			}
			else {
				System.out.println(string + " is NOT a Palindrome!");
			}
		}
	}
}