package nfa0031;

public class MaClass3 {
	static String chaine = " Bonne année ";
	static int nombre = 2021;
	public static void maMethodeStatique() {
		System.out.println(" Appel de la méthode statique " + chaine + nombre);
	}
	public static int maMethodeStatique2(int uneValeur) {
		int resultat = nombre + uneValeur;
		return resultat;
	}
}
