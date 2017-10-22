import java.util.Random;

import javax.swing.JOptionPane;

public class JourMumJuan {
	static void trianglePrinter(String character, int Ran) {
		for(int j=0; j<Ran-1; j++) {
		for (int i = 0; i <=j; i++) {
			System.out.print(character);}
		System.out.println();}
		
			
		
		
		
	}

	public static void main(String[] args) {
		String character = JOptionPane.showInputDialog("Gimme a random character!");
		Random R = new Random();
		int Ran = R.nextInt(16) + 5;
		trianglePrinter(character, Ran);

	}

}
