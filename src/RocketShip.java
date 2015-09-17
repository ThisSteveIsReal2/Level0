import java.io.IOException;

public class RocketShip {
private static String i;

public static void main(String[] args) throws IOException, InterruptedException {
	for (int i = 10; i > -1; i--) {
		Runtime.getRuntime().exec("say "+i).waitFor();
		System.out.println(""+i);
	}
	Runtime.getRuntime().exec("say Happy Birth Day ").waitFor();
	
		
	}
}

