package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		String nickels = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		String quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		int nickelsi = Integer.parseInt(nickels);
		int dimesi= Integer.parseInt(dimes);
		int quartersi = Integer.parseInt(quarters);
		
		
		
		
		double money = nickelsi*0.05 + dimesi*0.1 + quartersi*0.25;
		
		 JOptionPane.showMessageDialog(null, "you have $" + money );
		
		// Ask the user how many nickels they have

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

