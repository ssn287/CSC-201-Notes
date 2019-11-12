import javax.swing.JOptionPane;

public class Arrays1D {
	public static String output = "";
	public static void readArrayValues(int[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100);
		}
	}
	public static void readArrayValuesRec(int[] a, int i) {
		if(i < a.length) {
			a[i] = (int)(Math.random() * 100);
			readArrayValuesRec(a, ++i);
		}
	}
	public static void printArrayValues(int[] a) {
		for(int i = 0; i < a.length; i++) {
			output += " " + a[i];
		}
	}
	public static void printArrayValuesRec(int[] a, int i) {
		if(i < a.length) {
			output += " " + a[i];
			printArrayValuesRec(a, ++i);
		}
	}
	public static double findSum(int[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public static double findSumRec(int[] a, int i) {
		if(i >= a.length) {
			return 0;
		}
		else {
			return a[i] + findSumRec(a, ++i);
		}
	}
	public static int findLargest(int[] a) {
		int largest = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
	}
	public static int findLargestRec(int[] a, int n, int i) {
		if(i >= a.length) {
			return n;
		}
		else {
			if(a[i] > n) {
				return findLargestRec(a, a[i], ++i);
			}
			else {
				return findLargestRec(a, n, ++i);
			}
		}
	}
	public static boolean isPrime(int n) {
		int k = 3;
		if(n <= 2) {
			return (n == 2) ? true : false;
		}
		if(n % 2 == 0) {
			return false;
		}
		while(k * k <= n) {
			if(n % k == 0) {
				return false;
			}
			k += 2;
		}
		return true;
	}
	public static boolean isPrimeRec(int n, int k) {
		if(n <= 2) {
			return (n == 2) ? true : false;
		}
		if(n % k == 0) {
			return false;
		}
		if(k * k > n) {
			return true;
		}
		return isPrimeRec(n, ++k);
	}
	public static void main(String[] args) {
		final int SIZE = 10;
		int[] w = new int[SIZE];
		readArrayValuesRec(w, 0);
		output += "\nThe Array Elements Are: ";
		printArrayValuesRec(w, 0);
		output += "\nThe Sum of the Array Elements is: " + findSumRec(w, 0);
		output += "\nThe Largest Array Element is: " + findLargestRec(w, w[0], 1);
		output += "\nThe Prime Numbers in the Array are: ";
		for(int i = 0; i < SIZE; i++) {
			if(isPrimeRec(w[i], 2)) {
				output += " " + w[i];
			}
		}
		JOptionPane.showMessageDialog(null, output);
	}
}