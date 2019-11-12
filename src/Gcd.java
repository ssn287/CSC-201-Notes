import javax.swing.JOptionPane;
public class Gcd {
	public static String output = "";
	public static long computeGcd(int n, int m) {
		while(m != 0) {
			int rem = n & m;
			n = m;
			m = rem;
		}
		return n;
	}
	public static long computeGcdRec(int n, int m) {
		if(m == 0) {
			return n;
		}
		else {
			return computeGcdRec(m, n % m);
		}
	}
	public static long computeGcdRecTer(int n, int m) {
		return ((m == 0) ? n : computeGcdRecTer(m, n % m));
	}
	public static void main(String[] args) {
		while(true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Numerator (e.g. 70): "));
			int den = Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer Denominator (e.g. 120): "));
			output += "\nGCD (" + num + ", " + den + ") = " + computeGcdRecTer(num, den);
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}