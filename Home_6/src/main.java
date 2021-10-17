import java.io.*;

import javax.swing.JOptionPane;
/*
 * Se citesc de la tastatură trei numere întregi a, b şi c. Să se
ordoneze aceste numere crescătoare, astfel încât a va fi minimul, iar în
c va fi maximul. Citirea de la tastatură se va face cu metoda
showInputDialog() din clasa JOptionPane. 
 */
public class main {

	public static void main(String[] args) {
		int a,b,c;
		int aux;
		a=Integer.parseInt(JOptionPane.showInputDialog("a="));
		b=Integer.parseInt(JOptionPane.showInputDialog("b="));
		c=Integer.parseInt(JOptionPane.showInputDialog("c="));
		if(a>b) {aux=a;a=b;b=aux;}
		if(a>c) {aux=a;a=c;c=aux;}
		if(c<b) {aux=c;c=b;b=aux;}
		System.out.println(a+"\n"+b+"\n"+c);
	}

}
