import javax.swing.JOptionPane;

/*
 * Se citesc trei numere întregi a, b şi c, de la tastatură. Să se
calculeze maximul dintre a şi b (se va folosi metoda definită separat
maxim(), ce are doi parametrii) şi maximul dintre a, b şi c (se va folosi
metoda definită separate maxim(), ce are trei parametrii). Această
aplicaţie ilustrează polimorfismul parametric în Java (posibilitatea ca
în aceeaşi clasă să existe două sau mai multe metode cu acelaşi nume,
dar cu liste de parametrii diferiţi). 

 */
public class main {

	public static void main(String[] args) {
		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("a="));
		b=Integer.parseInt(JOptionPane.showInputDialog("b="));
		c=Integer.parseInt(JOptionPane.showInputDialog("c="));
		System.out.println(maxim(a,b));
		System.out.println(maxim(a,c));
		System.out.println(maxim(b,c));
		System.out.println(maxim(a,b,c));
	}
	public static int maxim(int a,int b) {
		if(a>b) return a;
		else return b;
	}
	public static int maxim(int a,int b,int c) {
		if(a>maxim(b,c)) return a;
		else
			return maxim(b,c);
	}
}
