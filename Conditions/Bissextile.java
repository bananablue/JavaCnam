package test;
import java.util.Scanner;

public class Bissextile {

	public static void anneeBissextile() {
		Scanner input = new Scanner(System.in);
		int annee = 0;
		
		System.out.println(" Entrez une ann�e : ");
		annee = input.nextInt();
		if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
			System.out.println(annee + " est une ann�e bisextile ;");
			convert.restart();
		}
		else {
			System.out.println(annee + " n'est pas une ann�e bissextile ;");
			convert.restart();
		}
			
	}
	
}
