import java.util.Random;

public class gama {
public int a,b,n,c,d,e,f;
Random r=new Random();
public gama(int n) {
	this.n=n;
}
public void calcul() {
	
	while(true) {
		a=1+r.nextInt(n);
		b=1+r.nextInt(n);
		c=1+r.nextInt(n);
		d=1+r.nextInt(n);
		e=1+r.nextInt(n);
		f=1+r.nextInt(n);
		if(a!=b && b!=c && c!=d && d!=e && e!=f) break;
	}
}
}
