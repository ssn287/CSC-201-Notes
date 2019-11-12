import javax.swing.JOptionPane;
public class Series {
	public static String output = "";
	public static long factorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n * factorial(--n);
		}
	}
	public static double findSum(int n, int coeff) {
		if(n <= 0) {
			return 0;
		}
		else {
			return Math.pow(coeff, 2) + findSum(--n, coeff + 2);
		}
	}
	public static double series1(int n) {
		double sum = 0;
		int d = 1;
		while(d <= n) {
			output += d + " / " + factorial(d) + " + ";
			sum = sum + (1.0) / factorial(d);
			d++;
		}
		return sum;
	}
	public static double series1Rec(int n, int d) {
		if(d >= 1) {
			return 0;
		}
		else {
			output += d + " / " + factorial(d) + " + ";
			return 1.0 / factorial(++d);
		}
	}
	public static void series2(int limit, int diff, int n) {
		if(limit > 0) {
			output += n + " , ";
			series2(--limit, ++diff, (n * 2 - diff));
		}
	}
	public static void series3(int limit, int n, int sign) {
		if(limit > 0) {
			output += n + " , ";
			series3(--limit, n * 2 * -sign, sign);
		}
	}
	public static void series4(int limit, int n, int i) {
		if(limit > 0) {
			output += (int)(n * Math.pow(i, 2)) + " , ";
			series4(--limit, n + 2, ++i);
		}
	}
	public static void series5(int n, int sign, int base) {
		int k = 1;
		while(k <= n) {
			output += " " + sign * Math.pow(k, base);
			k++;
			sign = -sign;
		}
	}
	public static void series5Rec(int n, int sign, int k) {
		if(k <= n) {
			output += " " + (int)(sign * Math.pow(k, 2));
			series5Rec(n, -sign, ++k);
		}
	}
	public static void series6(int n) {
		int coeff = 1;
		while(coeff <= n) {
			output += " " + coeff + "^2 + ";
			coeff += 2;
		}
	}
	public static void series6Rec(int n, int coeff) {
		if(n > 0) {
			output += " " + coeff + "^2 + ";
			series6Rec(--n, coeff + 2);
		}
	}
	public static void main(String[] args) {
		while(true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Limit (e.g. 15): "));
			double s1 = series1Rec(n, 1);
			output += "\nThe Sum of Series 1 up to " + n + " is " + s1 + "\n";
			series2(n, 0, 3); output += "\n";
			series3(n, 3, 1); output += "\n";
			series4(n, 3, 1); output += "\n";
			series5Rec(n, 1, 2); output += "\n";
			series6Rec(n, 1);
			JOptionPane.showMessageDialog(null, output);
			output = "";
		}
	}
}