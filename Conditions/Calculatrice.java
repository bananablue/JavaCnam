package test;
import java.util.Scanner;

public class Calculatrice {
	public static void test() {
		Scanner input = new Scanner(System.in);
	int a ;
	int b ;
	int c ;
	String signe;
	System.out.println("Entrer un chiffre entier : ");
	a = input.nextInt();
	System.out.println(" Entrer un oprateur ( + , - , *, /) " );
	signe = input.next();
	System.out.println(" Entrer un autre entier : ");
	b = input.nextInt();
	
	if(signe.equals("+")) {
		c = a + b;
		System.out.println(a + signe + b + " = "  + c);
		
	}
	else if(signe.equals("-")) {
		c = a - b;
		System.out.println(a + signe + b + " = "  + c);
		
	}
	else if(signe.equals("*")) {
		c = a * b;
		System.out.println(a + signe + b + " = "  + c);
		
	}
	else if(signe.equals("/")) {
		c = a / b;
		System.out.println(a + signe + b + " = "  + c);
		
	}
	else {
		System.out.println(" recommencer svp");
	}
	convert.restart();

	
	}	
}
