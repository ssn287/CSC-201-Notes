import javax.swing.JOptionPane;
public class Arrays2D {
	public static String output = "";
	public static void readArrayValues(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	public static void printArrayValues(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				output += " " + a[i][j];
			}
			output += "\n";
		}
	}
	public static void main(String[] args) {
		final int ROWS = 3; final int COLS = 5;
		int[][] w = new int[ROWS][COLS];
		readArrayValues(w);
		output += "\nThe Array Elements Are: \n";
		printArrayValues(w);
		JOptionPane.showMessageDialog(null, output);
	}
}