//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		for (int j = 0; j < 10; j++) {
		int randomNumber = new Random().nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You Have A Nice Shirt");
		}
		else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "Your hair looks nice");
		}
		else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You look really nice today");
		}
		else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "I like your hair");
		}
		else  {
			JOptionPane.showMessageDialog(null, "Have a nice day");
		}
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
