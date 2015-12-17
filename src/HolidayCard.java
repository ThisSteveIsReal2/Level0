import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class HolidayCard extends MouseAdapter {

	double treeWidth = 15;
	double scale = 1.1;	//This is how much the width of the tree increases with each layer down
	
	void drawTreeBody() {
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Color.green);
		int dino = 175;
		Tortoise.turn(90);
		for (int i = 0; i < 12; i++) {
			Tortoise.move(treeWidth);
			Tortoise.turn(dino);
			treeWidth *= scale;
			Tortoise.move(treeWidth);
			Tortoise.turn(-1 * dino);
			treeWidth *= scale;
			dino -= 1;
		}
	}

	void drawTreeTrunk() {
		Tortoise.move(treeWidth / 2);
		Tortoise.turn(90);
		Tortoise.setPenWidth(treeWidth / 10);
		Tortoise.setPenColor(PenColors.Browns.SaddleBrown);
		Tortoise.move(treeWidth / 4);
	}

	void drawStar() {

		for (int i = 0; i < 5; i++) {
			Tortoise.penDown();
			Tortoise.setPenColor(Color.CYAN);
			Tortoise.move(40);
			Tortoise.turn(144);
		}
	}
	/* 1. Paste your methods from the Christmas Tree Recipe here. */

	/* 2. When the mouse is clicked draw a tree at that position. */
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("mouse clicked!");

		int mouseX = mouseEvent.getX();
		int mouseY = mouseEvent.getY();
		// Set the X position of the Tortoise to the X position of the mouse
Tortoise.setX(mouseX);
		drawTree();
	}

	/* 3. Personalize your card. */
	void drawGreetingAndSing() {
		// Download a Christmas sound (wav, midi or aiff) and use the playMusic() method to play it
writeGreeting("Happy Birthday Khia! P.S My birthday is Decemeber 28");

		// Use the writeGreeting() method to add a festive message
playMusic("All I Want for Christmas is You - Mariah Cary.wav");
	}

	private void writeGreeting(String greeting) {
		tortoiseWindow.getGraphics().drawString(greeting, 250, 50);
	}

	private void playMusic(String nameOfSoundFile) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(nameOfSoundFile));
		sound.play();
	}

	void drawTree() {
		drawStar();
		drawTreeBody();
		drawTreeTrunk();
		treeWidth = 15;
		Tortoise.setAngle(0);
		Tortoise.setPenWidth(treeWidth / 5);
	}

	public static void main(String[] args) {
		new HolidayCard();
	}

	TurtlePanel tortoiseWindow;

	HolidayCard() {
		tortoiseWindow = Tortoise.getBackgroundWindow();
		tortoiseWindow.addMouseListener(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		drawGreetingAndSing();
	}
}
