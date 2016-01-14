// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String dino = JOptionPane.showInputDialog("How many dimes do you have");
		// Convert their answer to an int using Integer.parseInt()
int NoDimes = Integer.parseInt(dino);
		// Ask the user how many dimes they have, and convert their answer
String Dino = JOptionPane.showInputDialog("How many nickles do you have");
		// Ask the user how many quarters they have, and convert their answer
int pickles = Integer.parseInt(Dino);
		// Calculate how much money the user has and save it in a double variable 
double money = NoDimes * .1 + pickles * .05;
		// Tell the user how much money they have
double result = 
	}
}
