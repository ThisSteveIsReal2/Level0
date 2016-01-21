// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TortiseSpiralMaker {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int Steve = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String Spoderman = JOptionPane.showInputDialog("Which spiral would you like (square or triangle)");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		if (Spoderman.equals("square"));{
			Steve = 4;
		}
		if (Spoderman.equals("triangle"));{
			Steve = 3;
		}
		else if()
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
for (int i = 0; i < 20; i++) {
	
Tortoise.setSpeed(10);
		Tortoise.penDown();	
		int Dino = i * 30;
		Tortoise.move(Dino);
		Tortoise.turn(Steve/360));
}
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}
	
}