package nfa031;
import java.util.Scanner;
public class ternaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println(" Entrez la note étrangère : ");
		float noteEtr = input.nextFloat();
		String result = null;
		result = test.Test(noteEtr);
		 System.out.println(result);
		String mention = test.Mention(noteEtr);
		 System.out.println(mention);
		 input.close();
		 
	}
	
}
