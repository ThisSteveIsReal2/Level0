
import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userNeigh = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Nigh1", "Negh2", "Neigh3" }, null);
		
		// 2. Their answer is stored in the userNeigh variable. Print it out.
		System.out.println(userNeigh);
		if (userNeigh == 0) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
			
		}
		if (userNeigh ==1) {
			playVideo("https://www.youtube.com/watch?v=o6b9JpBFjd4");
		}
		// 3. If they are in a stressed neigh, use the playVideo method to play a calming song from YouTube.

		// 4. Play different songs for other neigh.

		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}