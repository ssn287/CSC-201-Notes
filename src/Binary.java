import javax.swing.JOptionPane;
public class Binary {
	public static String output = "";
	public static String converToBinary(int n) {
		String binary = "";
		while(n > 0) {
			binary = n % 2 + " " + binary;
			n /= 2;
		}
		return binary;
	}
	public static String convertToBinaryRec(int n) {
		if(n == 0) {
			return "";
		}
		else {
			return convertToBinaryRec(n / 2) + n % 2;
		}
	}
	public static String convertToBinaryRecTer(int n) {
		return ((n == 0) ? " " : (convertToBinaryRecTer(n / 2) + (n % 2)));
	}
	public static long convertToDecimal(int n) {
		long decimal = 0;
		long temp = n;
		for(int i = 0; temp != 0; i++) {
			temp = n % 10;
			decimal += (long)(temp * Math.pow(2,  i));
			n /= 10;
		}
		return decimal;
	}
	public static long convertToDecimalRec(int n, int i) {
		if(n == 0) {
			return 0;
		}
		else {
			return convertToDecimalRec(n / 10, ++i) + (n % 10) * (long)(Math.pow(2, i));
		}
	}
	public static void main(String[] args) {
		while(true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Number (e.g. 173): "));
			String binary = convertToBinaryRecTer(n);
			output += "\nThe Decimal Number " + n + " in Binary is: " + binary;
			int m = Integer.parseInt(JOptionPane.showInputDialog("\nEnter a Binary Number (e.g. 10110: "));
			long decimal = convertToDecimalRec(m, 0);
			output += "\nThe Binary Number " + m + " in Decimal is: " + decimal;
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}