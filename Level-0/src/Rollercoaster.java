import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("In inches, how tall are you?");
		
		int num = Integer.parseInt(answer);
		if(num>49){
			JOptionPane.showMessageDialog(null, "Enjoy the ride!");
		}
		else if(num>34&&num<50){
			JOptionPane.showMessageDialog(null, "You may ride this coaster, but you must be accompanied by an adult.");
		}
			
		else if(num<35){
				JOptionPane.showMessageDialog(null, "Sorry, you should really consider growing.");
				
				
				
			
		
		
		
		
		
		
		
		
		}
	
	
	}


}
