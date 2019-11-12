import javax.swing.JOptionPane;
import java.math.BigDecimal;
public class Leibniz {
	public static String output = "";
	public static BigDecimal computePi(int n) {
		BigDecimal sum = BigDecimal.ZERO;
		int k = 1;
		long den = 1;
		while(den < n) {
			sum = sum.add(BigDecimal.valueOf(k * (1.0 / den)));
			den += 2;
			k = -k;
		}
		return sum.multiply(BigDecimal.valueOf(4));
	}
	public static void main(String[] args) {
		while(true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Number (e.g. 2000): "));
			output += "\nThe Value of Pi up to " + num + " is " + computePi(num);
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}