package nfa0031;

public class Tp3 {

	/***********************    TRI    *****************************************/
	 static String tri(int chiffre1,int chiffre2, int chiffre3) {
		int tmp;
		String res;
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
	res = chiffre1 + " " + chiffre2 + " " + chiffre3;
	 return res;
	 }
	 /************************    SWITCHCASEGRADE    *******************************************/
	 
	 static String switchGrade( String note) {
		 switch (note) {
			case "a" : 
				System.out.println(" Excellent ");
				break;
			case "b" :
				System.out.println(" Very good ");
				break;
			case "c" : System.out.println(" Good ");
				break;
			case "d" : System.out.println(" Pass grade ");
				break;
			case "e" : System.out.println(" Fail ");
				break;
			default: System.out.println("Invalid Grade ");
		}
		 return note;
	 }
}
