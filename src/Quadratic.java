import javax.swing.JOptionPane;
public class Quadratic {
	public static String output = "";
	public static int calculateDiscriminant(int a, int b, int c) {
		return b * b - 4 * a * c;
	}
	public static double quadratic(int a, int b, int c, boolean shouldAdd) {
		if(shouldAdd) {
			return (-b + Math.sqrt(calculateDiscriminant(a, b, c))) / 2 * a;
		}
		else {
			return (-b - Math.sqrt(calculateDiscriminant(a, b, c))) / 2 * a;
		}
	}
	public static void main(String[] args) {
		while(true) {
			int a = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Coefficient for 'a' (e.g. 3): "));
			int b = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Coefficient for 'b' (e.g. 2): "));
			int c = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Coefficient for 'c' (e.g. 5): "));
			output += "\nThe Quadratic Equation " + a + "x^2 + " + b + "x + " + c + " = " + 0;
			int discr = calculateDiscriminant(a, b, c);
			if(discr < 0) {
				output += "\nThe Quadratic Equation has No Roots";
			}
			else {
				if(discr == 0) {
					output += "\nThe Quadratic Equation has Only One Root: " + quadratic(a, b, c, true);
				}
				else {
					output += "\nThe Quadratic Equation has Two Roots: ";
					output += "\n\tThe First Root of the Equation is:  " + quadratic(a, b, c, true);
					output += "\n\tThe Second Root of the Equation is: " + quadratic(a, b, c, false);
				}
			}
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}