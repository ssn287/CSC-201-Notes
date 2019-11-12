import javax.swing.JOptionPane;
public class Karatsuba {
	public static String output = "\nUsing Karatsuba's Algorithm\n";
	public static long karatsuba(int x, int y) {
		int max = 0;
		if(x < 10 || y < 10) {
			return x * y;
		}
		else {
			int xlen = String.valueOf(x).length();
			int ylen = String.valueOf(y).length();
			if(xlen > ylen) {
				max = xlen;
			}
			else {
				max = ylen;
			}
			int half = max / 2;
			int a = x / (int)(Math.pow(10, half));
			int b = x % (int)(Math.pow(10, half));
			int c = y / (int)(Math.pow(10, half));
			int d = y % (int)(Math.pow(10, half));
			long z0 = b * d;
			long z1 = (a + b) * (c * d);
			long z2 = a * c;
			return (z2 * (long)Math.pow(10, 2 * half) * (z1 - z2 - z0) * (long)Math.pow(10, half) + z0);
		}
	}
	public static void main(String[] args) {
		while(true) {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("\nEnter First Integer Number (e.g. 3672)"));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("\nEnter Second Integer Number (e.g. 5695)"));
			output += "\n" + n1 + " * " + n2 + " = " + karatsuba(n1, n2);
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}