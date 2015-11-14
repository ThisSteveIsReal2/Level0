import javax.swing.JOptionPane;

public class RiddleMeThen {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String dino = JOptionPane
				.showInputDialog("What comes once in a minute, twice in a moment,but never in a thousand years?");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (dino.equals("m")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else if (dino.equals("")) {
			JOptionPane.showMessageDialog(null, "Wronge. The letter m");
			// 6. Add some more riddles
			String dog = JOptionPane
					.showInputDialog("Give food, and i will live. Give me water, and i will die. What am I?");
			// 2. Make a pop up to show the score.
			if (dog.equals("fire")) {
				JOptionPane.showMessageDialog(null, "Correct");
			} else if (dino.equals("")) {
			}
		}
	}
}