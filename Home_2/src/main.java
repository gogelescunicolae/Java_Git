/*Scrieţi o aplicaţie Java care să reconstituie scăderea:
a= s z u –
b= s2 2 u2
---------
c= s3 z3 u3 
c= 8 7 9
*/
public class main {

	public static void main(String[] args) {
		int s,z,u;
		int s2,u2;
		int s3,z3,u3;
		Boolean ok=false;
		for(u=0;u<10;u++) {
			for(z=0;z<10;z++) {
				for(s=1;s<10;s++){
					for(u2=0;u2<10;u2++) {
						for(s2=1;s2<10;s2++)
						{
							s3=s-s2;
							z3=z-2;
							u3=u-u2;
							int a=(s*10+z)*10+u;
							int b=(s2*10+2)*10+u2;
							int c=(s3*10+z3)*10+u3;
							//if(s3==8 && z3==7 && u3==9) System.out.println("a= " + a +"\nb= "+b+"\nc= "+c);
							if(c==348) {ok=true;System.out.println("a= " + a +"\nb= "+b+"\nc= "+c+"\n");}
						}
					}
					
				}
			}
		}	
		if(ok==false) System.out.println("Error");
	}
	
}
