import java.io.*;
/*Să se afişeze toţi divizorii unui număr întreg dat ca parametru
în linia de comandă. 
*/
public class main {

	public static void main(String args[])
	{	
		int numar,k=1;
		numar= Integer.parseInt(args[0]);
		while(k<=numar) {
			if(numar%k==0) System.out.println(k);
			k++;
		}
		System.out.println(numar);
	}
}
