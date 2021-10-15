//Să se calculeze şi afişeze câte numere naturale de patru cifre,
//împărţite la 67, dau restul 23

import java.io.*;


public class main {

	public static void main(String[] args) {
		int d=1000;//dempartit
		int i=84 ;//impartitor
		int r=6 ;//rest
		int k=0;
			while(d<=9999) {
				if(d%i==r) k++;
				d++;
			}
			System.out.println(k);
			
	}

}
