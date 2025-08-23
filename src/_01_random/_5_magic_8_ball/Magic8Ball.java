//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {


		// 2. Get the user to enter a question for the 8 ball to answer
		String something = JOptionPane.showInputDialog("Ask a question");

		// 3. Make a variable and initialize it to a random number.
		//     ** You will need to make a random object!
		//     Limit the random numbers to be between 0 and 3
		Random randomMaker = new Random();
		int ran = randomMaker.nextInt(4);

		// 4. If the random number is 0
		if(ran == 0) {
			JOptionPane.showMessageDialog(null, "yuh");
		}
		// -- tell the user "Yes"

		// 5. If the random number is 1
		if(ran == 1) {
			JOptionPane.showMessageDialog(null, "nuh");
		}
		// -- tell the user "No"

		// 6. If the random number is 2
		if(ran == 2) {
			JOptionPane.showMessageDialog(null, "ausk guguhl");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 7. If the random number is 3
		if(ran == 3) {
			JOptionPane.showMessageDialog(null, "Iuh uhnuhstluh duhnt knuh");
			// -- write your own answer
		}
	}
}