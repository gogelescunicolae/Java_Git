import java.util.Random;

/*
 * Să se afişeze din câte încercări se generează trei numere
aleatoare egale, în gama 0..19. 
 */
public class main {

	public static void main(String[] args) {
		final int gama=20;
		int k=0,a,b,c;
		Random r=new Random();
		while(true) {
			a=r.nextInt(gama);
			b=r.nextInt(gama);
			c=r.nextInt(gama);
		k++;
			if(a==b && b==c) break;
		}
		System.out.println(k);
	}

}
