package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		
		// Write code to ask the user what day it is.
		String day = JOptionPane.showInputDialog(null, "What day of the week is it?");
	    if(day.equalsIgnoreCase("sunday")) {
	    JOptionPane.showMessageDialog(null, "You can sleep in today");
	    }
	    else if(day.equalsIgnoreCase("saturday")) {
	    	JOptionPane.showMessageDialog(null, " You can sleep in today" );
	    }
	    else {
	    	JOptionPane.showMessageDialog(null, "wake up you sleepy head" );
	    }
		// Set the boolean isWeekend based on the value they enter
		
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String score = JOptionPane.showInputDialog(null, "What score % did you get on your last exam?");
		int iscore = Integer.parseInt(score);
		if(iscore>70) {
			passedExam = true;
			JOptionPane.showMessageDialog(null, "Congrats" );
		}
		else {
			passedExam = false;
			JOptionPane.showMessageDialog(null, "better luck next time" );
		}
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "GAME OVER" );
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("What color should I draw with?");
		if(color.equalsIgnoreCase("Red")) {
			isRed = true;
		}
		boolean isSquare = false;	
		String shape = JOptionPane.showInputDialog("What shape should I draw?");
		if(shape.equalsIgnoreCase("Square")) {
			isSquare = true;
		}            
		
		if(isRed && isSquare) {
			drawRedSquare();
		}
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setSpeed(70);
		rob.penDown();
		rob.setPenColor(255, 0, 0);
		for(int i = 0; i <= 4; i++) {
		rob.move(100);
		rob.turn(90);
		}
		// Complete the rest of this method
	}	
}
