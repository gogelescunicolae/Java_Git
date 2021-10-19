import javax.swing.JOptionPane;

/*
 * Se citeşte un număr natural N. Să se calculeze termenul de
rang N din şirul lui Fibonacci.
Şirul lui Fibonacci se defineşte recursiv astfel:
a0= 1
a1=1
an=an-1+an-2 , pentru n>=2 
 */
public class main {
	public static void main(String[] args) {
		int n;
		n=Integer.parseInt(JOptionPane.showInputDialog("n= "));
		System.out.println(sirFibo(n));
	}
	
	private static int sirFibo(int n) {
		if(n==1) return 1;
		if(n==2) return 1;
		return sirFibo(n-1)+sirFibo(n-2);
	}
}
