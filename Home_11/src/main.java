import java.io.*;

import javax.swing.JOptionPane;
/*
 * Se citeşte un număr natural de la tastatură. Să se afişeze care
este cifra maximă din acest număr. 
 */
public class main {
	public static void main(String[] args) {
		int n;
		n=Integer.parseInt(JOptionPane.showInputDialog("n="));
		if(n<10) System.out.println(n);
		else
			System.out.println(maxCif(n));
	}
	public static int maxCif(int n) {
		int a;
		int k=-5;
		while(n!=0) {
			a=n%10;
			if(k<a) k=a;
			n/=10;
		}
		return k; 
	}
}
