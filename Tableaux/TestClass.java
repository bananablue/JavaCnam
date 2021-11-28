package nfa031;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = GestionTabInt.randomTab();
		GestionTabInt.ecrire(tab1);
		int[] tab2 = GestionTabInt.ajoute(tab1);
		System.out.println("  La somme des index est de : " + GestionTabInt.somme(tab1));
		System.out.println("  L'index max est : " + GestionTabInt.indexMax(tab1));
		System.out.println("  La moyenne des chiffre du tableau est de : " + GestionTabInt.moyenne(tab1));
		GestionTabInt.ecrire(tab2);

	}

}
