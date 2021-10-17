import java.io.*;

import javax.swing.*;

/*
 *  Se citesc două numere a şi b. Să se afişeze dacă cele două
numere au acelaşi număr total de divizori. 
 */

public class main {
	public static void main(String[] args) {
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("a="));
		b=Integer.parseInt(JOptionPane.showInputDialog("b="));
		int a_div=0,b_div=0;
		int k=1;
		while(k<=a) {
			if(a%k==0) a_div++;
			k++;
		}
		k=1;
		while(k<=b) {
			if(b%k==0) b_div++;
			k++;
		}
		if(a_div==b_div) System.out.println(a_div+"\n"+b_div);
		else System.out.println("No match");
	}
}
