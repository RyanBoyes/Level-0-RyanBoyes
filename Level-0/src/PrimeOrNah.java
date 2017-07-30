import javax.swing.JOptionPane;

public class PrimeOrNah {
	public static void main(String[] args) {
	
 String Num = JOptionPane.showInputDialog(null, "What's your number? I'll see if it's prime.");
 int Number = Integer.parseInt(Num);
 for (int i = 2; i < Number; i++) {
	if (Number%i==0) {
		JOptionPane.showMessageDialog(null, Number + " isn't prime.");
	System.exit(0);
	}
	}
 JOptionPane.showMessageDialog(null, Number + " is prime.");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}










}
