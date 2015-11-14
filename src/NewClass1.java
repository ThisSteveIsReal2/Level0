import javax.swing.JOptionPane;

public class NewClass1 {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		for (int i = 0; i < 4; i++) {

			String dino = JOptionPane.showInputDialog("Do you know how to write code");

			// 2. If they say "yes", tell them they will rule the world.
			if (dino.equals("yes")) {
				JOptionPane.showMessageDialog(null, "then you will rule the world!");

			}
			// 3. Otherwise, wish them good luck washing dishes.
			else if (dino.equals("no")) {
				JOptionPane.showMessageDialog(null, "good luck washing dishes then");
			}
		}
	}
}