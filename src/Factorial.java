import java.math.BigInteger;
import javax.swing.JOptionPane;
public class Factorial {
	public static String output = "";
	public static BigInteger computeFact(int n) {
		BigInteger factorial = BigInteger.ONE;
		while(n > 0) {
			factorial = factorial.multiply(new BigInteger("" + n));
			n--;
		}
		return factorial;
	}
	public static BigInteger computeFactRec(int n) {
		if(n <= 1) {
			return BigInteger.ONE;
		}
		else {
			return BigInteger.valueOf(n).multiply(new BigInteger("" + computeFactRec(--n)));
		}
	}
	public static void main(String[] args) {
		while(true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Number (e.g. 5): "));
			long start = System.currentTimeMillis() * 100;
			output += "\nThe Factorial of " + num + " is " + computeFact(num);
			long end = System.currentTimeMillis() * 100;
			output += "\nTime Spent Before and After Function Call: " + (end - start);
			System.out.print(output);
			output = "";
		}
	}
}