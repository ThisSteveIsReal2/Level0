import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortois {

	public static void main(String[] args) {
		/*
		 * 1. Use the dance method to make the Tortoise spin.
		 *
		 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 * that number of times.
		 */
		String Cat = JOptionPane.showInputDialog(null,"How Dizzy do you want you tortoise to go from 1-10");
		int dog = Integer.parseInt(Cat);

			dance(dog);
	}
	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
