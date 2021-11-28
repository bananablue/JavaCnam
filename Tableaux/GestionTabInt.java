package test;

public class GestionTabInt {
	
	
	
	public static int somme (int [] tab) {
		int resultat = 0;
		
		for( int i = 0; i < tab.length; i++) {
			resultat = resultat + tab[i];
		}
		
		return resultat;
	}
	
	
	public static int indexMax(int [] tab) {
		int max= 0;
		for ( int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab [i];
			}
			else if (tab [i] == max) {
				max = i;
			}
		}
		
		
		return max;
	}
	
	
}
