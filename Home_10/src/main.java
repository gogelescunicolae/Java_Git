import java.io.*;
/*
 * Se citesc n1 şi n2 capetele unui interval închis. Să se afişeze
dacă în intervalul [n1, n2], există cel puţin un număr prim. 
 */

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("n1= "));
		n2=Integer.parseInt(JOptionPane.showInputDialog("n2= "));
		int k=0;
		for(int i=n1;i<=n2;i++)
		{
			if(prim(i)) {k++;System.out.println(i);}
		}
		System.out.println(k);
	}
	public static boolean prim(int i) {
		int ok=1;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) ok=0;
		}
		if(ok==1) return true;
		else return false;
	}
}
