import javax.swing.JOptionPane;

public class inSALTING {

public static void main(String[] args) {
	

String Trixy = JOptionPane.showInputDialog(null,"What is your name?");
if (Trixy.equals("roborto")){
 speak("You really need a breath mint because I can smell your breath from a mile away!");
}

else if (Trixy.equals("noelani")){
	speak("That's a your really scary mask your wearing!");
}
else if (Trixy.equals("june")){
	speak("Have you thought about going to the dentist because something looks crooked.");
}
else if (Trixy.equals("")){
	speak("Hey you don't look so good because there is something wrong about everything on your face.");
}

}
















static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }































}
