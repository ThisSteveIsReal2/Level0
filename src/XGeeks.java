
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
		String Noelani = "You have the ability to Adaptobility";
		String Nancy = " You are a Motovater";
		String Joon = "You have Jedi mind tricks";
		String Kira = "You can run supa dupa fast";
		String Khia = "You have the ability to change into a Alicorn";
		String Courtaney ="You are the best person in the entire world";
		String Vinh = "You are the best vido gamer in the world";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Dino = JOptionPane.showInputDialog(null, "What is your name?");

		

		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (Dino.equals("Bob")) {
			JOptionPane.showMessageDialog(null, Bob);
		}
		
		if (Dino.equals("Nancy")) {
			JOptionPane.showMessageDialog(null, Nancy);
		}
		
		if (Dino.equals("Noelani")) {
			JOptionPane.showMessageDialog(null, Noelani);
		}
		
		if (Dino.equals("Joon")) {
			JOptionPane.showMessageDialog(null, Joon);
				}
		
		if (Dino.equals("Kira")) {
			JOptionPane.showMessageDialog(null, Kira);
			}
		if (Dino.equals("Khia")) {
			JOptionPane.showMessageDialog(null, Khia);
}
		if (Dino.equals("Courtaney")) {
			JOptionPane.showMessageDialog(null, Courtaney);
		}
		if (Dino.equals("Vinh")) {
			JOptionPane.showMessageDialog(null, Vinh);
		}
}
}