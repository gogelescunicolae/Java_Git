import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Să se scrie o metodă ce are ca parametru un număr natural N;
metoda returnează două/sase numere aleatoare diferite, în gama 0...N-1.
Daţi şi un exemplu de aplicaţie în care se foloseşte această metodă. 
 */
public class main {//n=0..48

	public static void main(String[] args) {
		int n;
		n=Integer.parseInt(JOptionPane.showInputDialog("n="));
		gama obj= new gama(n);
		obj.calcul();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
	}

}
