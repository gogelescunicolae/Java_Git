import java.io.*;
/*
 * Să se calculeze primul număr prim mai mare decât un număr
dat ca parametru în linia de comandă. 
 */

public class main {

	public static void main(String[] args) {
		int numar;
		Boolean ok=true;
		numar=Integer.parseInt(args[0]);
			int k=2;
			while(k<numar && ok == true ) {
					if(numar%k==0) {numar++;k=2;} 
				k++;
			}
		if(ok==true) System.out.println(numar);
			else  System.out.println("Don't exist!");

	}

}
