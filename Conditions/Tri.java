package nfa0031;
import java.util.Scanner;
public class Ex6Tri {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		
		int chiffre1;
		int chiffre2;
		int chiffre3;
		int tmp;
		
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
		System.out.println(chiffre1 + "  " + chiffre2 + "  " + chiffre3  );
		// TRI 
		if (chiffre2 < chiffre1) {
		 tmp = chiffre1;
		 chiffre1 = chiffre2;
		 chiffre2 = tmp;
		}
		
		if (chiffre3 < chiffre2 ) {
			tmp = chiffre2;
			chiffre2 = chiffre3;
			chiffre3 = tmp;
		}
		if (chiffre2 < chiffre1) {
			tmp =chiffre1;
			chiffre1 = chiffre2;
			chiffre2 = tmp;
		}
		
		//RESULTAT
		System.out.println(chiffre1 + "  " + chiffre2 + "  " + chiffre3  );
		
		
		input.close();
		
	}

}
