import javax.swing.JOptionPane;
public class Exponent {
	public static String output = "";
	public static long computeExp(int b, int e) {
		long n = 1;
		while(e > 0) {
			n *= b;
			e--;
		}
		return n;
	}
	public static long computeExpRec(int b, int e) {
		if(e == 0) {
			return 1;
		}
		else {
			return b * computeExpRec(b, --e);
		}
	}
	public static long computeExpRecTer(int b, int e) {
		return ((e == 0) ? 1 : b * computeExpRecTer(b, --e));
	}
	public static void main(String[] args) {
		while(true) {
			int base = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Base (e.g. 2): "));
			int exp = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Exponent (e.g. 13): "));
			output += base + " ^ " + exp + " = " + computeExpRecTer(base, exp);
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}