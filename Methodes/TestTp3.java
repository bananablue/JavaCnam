package nfa0031;

import java.util.Scanner;

public class TestTp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		/* 
		int chiffre1;
		int chiffre2;
		int chiffre3;
		
		
		//SAISIE
		System.out.println(" Entrez un chiffre entier : ");
		chiffre1 = input.nextInt();
		System.out.println(" Entrez un deuxième chiffre entier : ");
		chiffre2 = input.nextInt();
		while (chiffre1 == chiffre2) {
		System.out.println(" Entrez un chiffre différent : ");	
		chiffre2 = input.nextInt();
		}
		
		System.out.println(" Entrez un dernier chiffre : ");
		chiffre3 = input.nextInt();
		while (chiffre1 == chiffre3 || chiffre2 == chiffre3 ) {
			System.out.println(" Entrez un chiffre différent : ");
			chiffre3 = input.nextInt();
			
		}
		
		
		String res = Tp3.tri(chiffre1, chiffre2, chiffre3);
		
		System.out.println(res);
	} */
		
		String note;
		System.out.println(" Choississez une note entre A et E : ");
		note = input.next();
			
		String res = Tp3.switchGrade(note);
		
		System.out.println(res);
		
	}
}
