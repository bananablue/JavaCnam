/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * @author Rudy
 *
 */
public class Switch {
public static void Case() {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	String note = null;
	
	System.out.println(" Choississez une note entre A et E : ");
	note = input.next();
	
	switch (note) {
		case "A": 
			System.out.println(" Excellent ");
			break;
		case "B" :
			System.out.println(" Very good ");
			break;
		case "C" : System.out.println(" Good ");
			break;
		case "D" : System.out.println(" Pass grade ");
			break;
		case "E" : System.out.println(" Fail ");
			break;
		default: System.out.println("Invalid Grade ");
	}
	convert.restart();

}
}
