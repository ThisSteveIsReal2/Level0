// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		for (int i = 0; i < 3; i++) {
			
		}
		String dino=
		JOptionPane.showInputDialog(null,"Do you like Banana's???");
	
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if  (dino.equals("yes")) {
			JOptionPane.showMessageDialog(null,"You are Awesome!!!");
<<<<<<< Updated upstream
			JOptionPane.showInputDialog(null, "Then what's your favorite hobbie?");
			JOptionPane.showMessageDialog(null, dino+ " would be much better with bananas!");
=======
		String pickel =	JOptionPane.showInputDialog(null, "What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, pickel+ " would be much better with bananas!");
>>>>>>> Stashed changes
		}
		if (dino.equals("no")){
			JOptionPane.showMessageDialog(null, "Your weird");
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	
	}

}