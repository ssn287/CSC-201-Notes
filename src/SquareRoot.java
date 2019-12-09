import javax.swing.JOptionPane;

public class SquareRoot {
	public static float babylonSqrt(float n) {
		float x = n; float y = 1; double limit = 0.0000001;
		while((x - y) / x > limit) {
			x = (x + y) / 2;
			y = n / x;
		}
		return x;
	}
	public static void main(String[] args) {
		while(true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an int: "));
			System.out.println(babylonSqrt(num));
		}
	}
}