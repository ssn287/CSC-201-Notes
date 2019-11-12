import javax.swing.JOptionPane;
public class Radix {
	public static String output = "";
	public static int getMax(int[] a, int n) {
		int max = a[0];
		for(int i = 1; i < n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void countSort(int[] a, int n, int e) {
		int[] output = new int[n];
		int[] count = new int[10];
		for(int i = 0; i < n; i++) {
			count[(a[i] / e) % 10]++;
		}
		for(int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}
		for(int i = n - 1; i >= 0; i--) {
			output[count[(a[i] / e) % 10] - 1] = a[i];
			count[(a[i] / e) % 10]--;
		}
		for(int i = 0; i < n; i++) {
			a[i] = output[i];
		}
	}
	public static void printArray(int[] a, int i) {
		if(i < a.length) {
			output += " " + a[i];
			printArray(a, ++i);
		}
	}
	public static void radixSort(int[] a, int n) {
		int m = getMax(a, n);
		for(int e = 1; m / e > 0; e *= 10) {
			countSort(a, n, e);
		}
	}
	public static void main(String[] args) {
		int[] w = {170, 45, 75, 90, 802, 24, 2, 66};
		output += "\nThe Unsorted Array is: \n";
		printArray(w, 0);
		radixSort(w, w.length);
		output += "\nThe Sorted Array is: \n";
		printArray(w, 0);
		JOptionPane.showMessageDialog(null, output);
	}
}