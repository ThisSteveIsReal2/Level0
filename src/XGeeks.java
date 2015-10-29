
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeeks {
	
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Bob = "You can eat 10 pizza's and become a cat";
		String Noelani = "Adaptobility";
		String Nancy = "Motovater";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Dino = JOptionPane.showInputDialog(null, "What is your name?");

		JOptionPane.showMessageDialog(null, "What is your name?");

		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (Dino.equals("Bob")) {
JOptionPane.showMessageDialog(null, Bob);
		}
		
		if (Dino.equals("Nancy")) {
			
		}
		
		if (Dino.equals("Noelani")) {
			
		}
		
	}
}