import java.io.*;
import javax.swing.*;
//import java.lang.*; Math.sqrt()
/*
 * Se citeşte un număr natural a. Să se afişeze dacă este pătrat
perfect sau nu. 
 */

public class main {
	public static void main(String[] args) {
			int a;
			int k=1,ok=0;
			a=Integer.parseInt(JOptionPane.showInputDialog("a="));
			while(k*k<=a) {
				if(k*k==a) ok=1;
				k++;
			}
			if(ok==1) System.out.println("Found");
			else System.out.println("Not Found");
	}

}
