
/*
 * class A
{
 public int x;
…
}
class B
{
 public static void main(String args[])
 {
 …
 }
}
În metoda main(), să se scrie în variabila x din clasa A, valoarea 7.
 
 */
public class main {

	public static void main(String[] args) {	
		A p = new A();
		p.x=7;
		System.out.println(p.x);
	}

}
