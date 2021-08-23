package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test {
public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog(null, "What score did you get on your last test?");
	double test = Double.parseDouble(score);
    if(test<60) {
   	 JOptionPane.showMessageDialog(null, "You got a F" );
    }
    else if(test<70) {
   	 JOptionPane.showMessageDialog(null, "You got a D");
    }
    else if(test<80) {
   	 JOptionPane.showMessageDialog(null, "You got a C" );
    }
    else if(test<90) {
   	 JOptionPane.showMessageDialog(null, "You got a B");
    }
	
    else if(test<200) {
      	 JOptionPane.showMessageDialog(null, "You got an A");
       }
    else {
    	JOptionPane.showMessageDialog(null, "Nice try! You'er not gonna break me");
    }
	
	
	
	
}
}
