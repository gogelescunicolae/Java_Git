import java.math.BigInteger;

/*
 * Folosind clasa BigInteger să se calculeze 2^1000. Vom folosi
metoda pow() din această clasă. Să se afişeze şi câte cifre are acest
rezultat. Metoda pow() are semnătura:
public BigInteger pow(int exponent) 
 */
public class main {

	public static void main(String[] args) {
			BigInteger p= new BigInteger("2");
			BigInteger t=p.pow(1000);
			String rezultat=t.toString();
			System.out.println(rezultat);
			System.out.println(rezultat.length());
	}

}
