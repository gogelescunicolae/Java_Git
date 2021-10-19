import javax.swing.JOptionPane;

/*
 * Se citeşte un număr natural n. Se citesc primul termen şi raţia
unei progresii aritmetice. Să se calculeze, recursiv, termenul de rang n
al progresiei.
 */
public class main {
	public static void main(String[] args) {
		int n;
		int t,r;
		n=Integer.parseInt(JOptionPane.showInputDialog("n="));
		t=Integer.parseInt(JOptionPane.showInputDialog("t="));
		r=Integer.parseInt(JOptionPane.showInputDialog("r="));
		System.out.println(progArit(n,t,r));
	}
	private static int progArit(int n,int t,int r) {
		int k=t;
		if(n>0) 
		{
			k=t+r;
			n-=1;
			return progArit(n,k,r);//p1=3,1,2,k=3 -> p2= 2,3,2,k=5 -> p3= 1,5,2,k=7 -> p4= 0,7,2 
		}
			else
				return k-r;
	}
}
