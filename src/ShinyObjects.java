import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ShinyObjects {

	public static void main(String[] args) {

		// 2. Ask the user how many shiny objects they want
String CATS = JOptionPane.showInputDialog(null,"How many shiny objects are required");
		// 3. Play the sound that many times
int CAT = Integer.parseInt(CATS);
		// 1. Call the method below
		playMisterZee();

	}

	public static void playMisterZee() {
    	try {
   		 File soundFile = new File("/Users/League/Google Drive/league-sounds/shiny-objects.wav");
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

}


