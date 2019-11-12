import javax.swing.JOptionPane;
public class RussianPeasant {
	public static String output = "";
	public static long russianPeasant(int m, int n) {
		long product = 0;
		while(m > 0) {
			if(m % 2 != 0) {
				product += n;
			}
			m /= 2;
			n *= 2;
		}
		return product;
	}
	public static void main(String[] args) {
		while(true) {
			int m = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Number (e.g. 275): "));
			int n = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Number (e.g. 117): "));
			output += "\n" + m + " * " + n + " = " + russianPeasant(m, n);
			JOptionPane.showMessageDialog(null, output);
		}
	}
}