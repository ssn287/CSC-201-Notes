import javax.swing.JOptionPane;
public class CreditCard {
	public static String output = "";
	public static long doubleSecond(long card) {
		long sum = 0;
		while(card > 0) {
			card = (long)(card / 10);
			int digits = (int)(card % 10) * 2;
			if(digits > 0) {
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
			long scndDigit = doubleSecond(card);
			long oddDigits = computeOdd(card);
			if(isValid(scndDigit, oddDigits)) {
				output += "\n\tThe Credit Card Number " + card + " is a Valid Card!";
				if(cardType == 4) {
					output += "\nThis Credit Card is a Visa";
				}
				else if(cardType == 5) {
					output += "\nThis Credit Card is a MasterCard";
				}
				else if(cardType == 6) {
					output += "\nThis Credit Card is a Discover";
				}
				else {
					output += "\nThis Credit Card is an American Express";
				}
			}
			else {
				output += "\n\tThe Credit Card Number " + card + " is NOT a Valid Card!";
			}
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}