import javax.swing.JOptionPane;

/*
 * Se citeşte un număr natural N. Să se calculeze suma primilor N
termeni din şirul lui Fibonacci. 
 */
public class main {

	public static void main(String[] args) {
	
		int n;
		n=Integer.parseInt(JOptionPane.showInputDialog("n="));
		System.out.println(verifFibo(n));
	}
	public static int verifFibo(int n) {
		int sum=0;
		int i=1;
		while(i<=n) { //    			
			sum+=sirFibo(i);
			i++;
		}
		return sum;
	}
	
	public static int sirFibo(int n) {
		if(n==1) return 1;
		if(n==2) return 1;
		else
			return sirFibo(n-1)+sirFibo(n-2);
	}
}
