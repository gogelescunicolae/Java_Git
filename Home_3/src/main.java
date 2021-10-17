import java.io.*;

/*
 * Să se calculeze valoare constantei PI, pe baza formulei:
 	pi/4 = 	+ 1     | *4 
 			- 1/3 	| *4
 			+ 1/5 	| *4
 			- 1/7 
 			+ 1/9  
 			- ...
	Se vor lua N=3000 de termini în această sumă.
 */
public class main {

	public static void main(String[] args) {
			double pi=0.0;
			int k=1;
			for(int i=0;i<3000;i++)
			{
				if(i%2==0) pi=pi + (4.0/k);
				else
					pi=pi -(4.0/k);
				k+=2;
			}
			System.out.println("pi= " + pi);
	}

}
