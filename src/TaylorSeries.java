import javax.swing.JOptionPane;
public class TaylorSeries {
	public static void taylors(int n) {
		int d = 0; int e = 0;
		while(d < n) {
			System.out.print(" " + "X^" + e + "/" + d + "! + ");
			d += 1;
			e += 1;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		while(true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an int: ")) ;
			taylors(num);
		}
	}
}