import javax.swing.JOptionPane;
public class Prime {
	public static String output = "";
	public static boolean isPrime(int n, int i) {
		if(n <= 2) {
			if(n == 2) {
				return true;
			}
			else {
				return false;
			}
		}
		if(n % i == 0) {
			return false;
		}
		if(i * i > n) {
			return true;
		}
		return isPrime(n, ++i);
	}
	public static void main(String[] args) {
		while(true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Number (e.g. 11): "));
			if(isPrime(num, 2)) {
				output += "\nThe Number " + num + " is a Prime Number!";
			}
			else {
				output += "\nThe Number " + num + " is NOT a Prime Number!";
			}
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}