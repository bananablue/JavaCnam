package nfa031;

public class test {
	public static String Test(float noteEtr) {
		String result = null;
		if ((noteEtr > 5) && (noteEtr < 0)) {
			result = " Il y a une erreur. ";
		} else if (noteEtr == 1) {
			result = " la note fran�aise est entre 19 et 20 . ";
		} else if (noteEtr == 1.3) {
			result = " La note fran�aise est de 18 .";
		} else if (noteEtr == 1.7) {
			result = " La note fran�aise est de 17 .";
		} else if (noteEtr == 2) {
			result = " La note fran�aise est de 16 .";
		} else if (noteEtr == 2.3) {
			result = " La note fran�aise est de 15 .";
		} else if (noteEtr == 2.7) {
			result = " La note fran�aise est de 14 .";
		} else if (noteEtr == 3) {
			result = " La note fran�aise est de 13 .";
		} else if (noteEtr == 3.3) {
			result = " La note fran�aise est de 12 .";
		} else if (noteEtr == 3.7) {
			result = " La note fran�aise est de 11 .";
		} else if (noteEtr == 4) {
			result = " La note fran�aise est de 10 .";
		} else if (noteEtr == 5) {
			result = " La note fran�aise est entre 0 et 9 .";
		}

		return result;
	}

	public static String Mention(float noteEtr) {

		String mention = (noteEtr == 0) || (noteEtr == 5) ? "Echec"
				: (noteEtr == 4) || (noteEtr == 3.7) ? "Passasble "
						: (noteEtr == 3.3) || (noteEtr == 3) ? "Assez bien "
								: (noteEtr == 2.7) || (noteEtr == 2.3) ? "bien " : "Tr�s bien";

		return mention;
	}
}