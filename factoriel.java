import java.util.Scanner;
 
public class factoriel {
 
	public static void main (String[]args){
		Scanner ad =  new Scanner(System.in);
		System.out.println(" donne un entier  ");
 
		int  a = ad.nextInt();
		//System.out.println("vous avez tapé "+a);
 
		if (a != 0) {
		for (int i=a-1 ;i>=1 ;i--){
			a=a*i;
		}
 
		System.out.println("donc le factoriel est =  "+a);
		} else 
                    a=1;
                    System.out.println("le factoriel est = "+a);
 
 
	}
}