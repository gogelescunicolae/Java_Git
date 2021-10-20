import java.math.BigInteger;

/*
 * Folosind clasa BigInteger , să se calculeze şi afişeze valoarea
numărului 50! Se va folosi metoda multiply(), ce are ca parametru un
număr BigInteger şi scoate ca rezultat un număr de tip BigInteger, care
reprezintă rezultatul înmulţirii între numărul dat ca parametru şi
obiectul curent (pentru care se apelează metoda multiply()). 
 */
public class main {

	public static void main(String[] args) {
			BigInteger p=new BigInteger("1");
		for(int i=2;i<=4;i++) 
		{
			p=p.multiply(new BigInteger(""+i));
			//System.out.println(p);
		}
			System.out.println(p);
			
	}

}
