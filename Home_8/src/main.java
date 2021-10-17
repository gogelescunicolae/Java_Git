import java.io.*;
import javax.swing.*;
/*
 * Write a program that detects whether a number, which is entered from the keyboard, is a perfect number.
 * A perfect number is a number that is equal to the sum of all of its divisors.
 */

public class main {
	public static void main(String[] args) {
			int a;
			a=Integer.parseInt(JOptionPane.showInputDialog("a="));
			int sum=0;
			int k=1;
			while(k<a) {
				if(a%k==0) sum+=k;
				k++;
			}
			if(sum==a) System.out.println(a);
			else	System.out.println("No match");
	}
}
