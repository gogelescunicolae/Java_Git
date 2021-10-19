import javax.swing.*;

/*
 * Se citeşte un număr natural N. Să se afişeze dacă acest număr
este termen în şirul lui Fibonacci.
 */
public class main {
		public static void main(String[] args) {
			int n;
			n=Integer.parseInt(JOptionPane.showInputDialog("n="));
			System.out.println(verifFibo(n));
			}
		
		private static Boolean verifFibo(int n){
			int i=1;
			while(sirFibo(i)<=n) {
				if(n==sirFibo(i)) return true;
				i++;
			}
			return false;
		}
		private static int sirFibo(int i) {
			if(i==1) return 1;
			if(i==2) return 1;
			else
				return sirFibo(i-1)+sirFibo(i-2);
		}
}
