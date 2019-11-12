import javax.swing.JOptionPane;
public class BinarySearch {
	public static String output = "";
	public static void readArrayValues(int[] a, int i) {
		if(i < a.length) {
			a[i] = (int)(Math.random() * 100);
			readArrayValues(a, ++i);
		}
	}
	public static void printArrayValues(int[] a, int i) {
		if(i < a.length) {
			output += " " + a[i];
			printArrayValues(a, ++i);
		}
	}
	public static void bubbleSort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j < a.length - i; j++) {
				if(a[j - 1] > a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static boolean binSearch(int[] a, int n, int low, int high) {
		if(low > high) {
			return false;
		}
		else {
			int mid = (low + high) / 2;
			if(n == a[mid]) {
				return true;
			}
			else {
				if(n > a[mid]) {
					return binSearch(a, n, ++mid, high);
				}
				else {
					return binSearch(a, n, low, --mid);
				}
			}
		}
	}
	public static void main(String[] args) {
		final int SIZE = 10;
		int[] w = new int[SIZE];
		readArrayValues(w, 0);
		output += "\nThe Unsorted Array is: ";
		printArrayValues(w, 0);
		output += "\nThe Sorted Array is: ";
		bubbleSort(w);
		printArrayValues(w, 0);
		JOptionPane.showMessageDialog(null, output);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
		}
		int n = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer (e.g. 1-100): "));
		if(binSearch(w, n, 0, SIZE - 1)) {
			output += "\nThe Number " + n + " is Found in the Array!";
		}
		else {
			output += "\nThe Number " + n + " is NOT Found in the Array!";
		}
		JOptionPane.showMessageDialog(null, output);
	}
}