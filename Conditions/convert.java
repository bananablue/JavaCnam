package test;
import java.util.Scanner;
public class convert {
	public static  Scanner input = new Scanner(System.in);
		public static void menu() {
			int choix = 0;
			System.out.println(" Convertir la température : ");
			System.out.println(" 1- De Farenheit vers Celsius. ");
			System.out.println(" 2- De Celsius vers Farenheit. ");
			choix = input.nextInt();
			
			if (choix == 1) {
				convertCelsius();
			}
			else if (choix == 2) {
				convertFarenheit();
				
			}
			else {
				System.out.println(" Choisissez entre 1 et 2 .");
			}
		}
		public static int temperature() {
			int  temp;
			System.out.println(" Entrez la température a convertir :");
			temp = input.nextInt();
			return temp;
		}
		public static void convertCelsius () {
			int resultat;
			System.out.println( " Convertir en Celsius : ");
			resultat = temperature();
			resultat = 
			
		}
		public static void convertFarenheit() {
			System.out.println(" Convertir en Farenheit : ");
			
		}
}
