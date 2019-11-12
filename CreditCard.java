import javax.swing.JOptionPane;

public class CreditCard {
	public static String output = "";
	public static long doubleSecond(long card) {
		long sum = 0;
		while(card > 0) {
			card = (long)(card / 10);
			int digits = (int)(card % 10) * 2;
			if(digits > 9) {
				sum = sum + (digits % 10) + (int)(digits / 10);
			}
			else {
				sum = sum + digits;
			}
			card = (long)(card / 10);
		}
		return sum;
	}
	public static long computeOdd(long card) {
		long sum = 0;
		while(card > 0) {
			sum = sum + (card % 10);
			card = (long)(card / 100);
		}
		return sum;
	}
	public static boolean isValid(long sc, long od) {
		if((sc + od) % 10 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int computeType(long card) {
		char ch = String.valueOf(card).charAt(0);
		int cha = ch - '0';
		return cha;
	}
	public static void main(String[] args) {
		while(true) {
			long card = Long.parseLong(JOptionPane.showInputDialog("\nEnter a Credit Card (e.g. 4388576018402626): "));
			long cardType = computeType(card);
			output += "This Credit Card";
			if(cardType == 4) {
				output += "\nIs a Visa";
			}
			else if(cardType == 5) {
				output += "\nIs a MasterCard";
			}
			else if(cardType == 6) {
				output += "\nIs a Discover";
			}
			else {
				output += "\nIs an American Express";
			}
			long scndDigit = doubleSecond(card);
//			output += "\n\tThe sum of the second digits doubled is: " + scndDigit;
			long oddDigits = computeOdd(card);
//			output += "\n\tThe sum of the digits in odd position is: " + oddDigits;
			if(isValid(scndDigit, oddDigits)) {
				output += "\n\tThe Credit Card Number " + card + " is a Valid Card!";
			}
			else {
				output += "\n\tThe Credit Card Number " + card + " is NOT a Valid Card!";
			}
			JOptionPane.showMessageDialog(null, output);
		}
	}
}