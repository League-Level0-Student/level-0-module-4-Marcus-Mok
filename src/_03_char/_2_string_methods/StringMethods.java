package _03_char._2_string_methods;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
//System.out.println(thing.charAt(2)); 

		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
String thing = JOptionPane.showInputDialog(null, "type a string you want to search a letter in");
String input = JOptionPane.showInputDialog(null, "type a character that you want to search");
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
//System.out.println(thing.length()); 
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
//for(int i = 0; i < thing.length(); i++) {
//	System.out.println(thing.charAt(i)); 
//}
for(int i = 0; i < thing.length(); i++) {
	if(thing.charAt(i)==input.charAt(0)){
		System.out.println("the letter is at space");	
		System.out.println(i+1);
	}
}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


