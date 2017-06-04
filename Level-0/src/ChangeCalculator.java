





	// Copyright The League of Amazing Programmers 2014
	import javax.swing.JOptionPane;
	 
	/*
	 * I have a pocket full of change. I hate doing math. Make me a program that
	 * will calculate how much money I have without me having to use my brain. Then
	 * make me a sandwich.
	 */
	public class ChangeCalculator {
	 
		public static void main(String[] args) {
			
			String answerP = JOptionPane.showInputDialog("How many pennies do you have?");
			double numP = Integer.parseInt(answerP);

	 
			// Ask the user how many nickels they have
			String answerN = JOptionPane.showInputDialog(null, "How many nickels do you have on you right now?");
			 
	 
			// Convert their answer to an int using Integer.parseInt()
			double numN = Integer.parseInt(answerN);
	 
			// Ask the user how many dimes they have, and convert their answer
			String answerD = JOptionPane.showInputDialog("Now, how many dimes do you have?");
			double numD = Integer.parseInt(answerD);
	 
			// Ask the user how many quarters they have, and convert their answer
			String answerQ = JOptionPane.showInputDialog("How many quarters do you have?");
			double numQ = Integer.parseInt(answerQ);
			
			
			
			
			
			
			
			
	 
			// Calculate how much money the user has and save it in a double variable
			
			double d = (5 * numN + 10 * numD + 25 * numQ + 1 * numP)/100;
	 
			// Tell the user how much money they have
			JOptionPane.showMessageDialog(null, "Congrats, you have $" + d);
			
	 
		}
	}






















