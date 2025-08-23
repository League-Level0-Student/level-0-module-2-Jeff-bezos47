//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();
		
		
		for(int dino=0; dino<10; dino++) {

		int randomNumber = randomMaker.nextInt(4);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Goooood, very gooood");
		}
		else if(randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "EUPHRATES RIVER");
		}
		else if(randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "NICE SHIRT");
		}
		else if(randomNumber == 3) {
			String something = JOptionPane.showInputDialog("Do you play Grow A Garden?? Yes or no?????");
			if(something.equalsIgnoreCase("Yes")) 
				JOptionPane.showMessageDialog(null, "You deserve a compliment: good jeb");



			else {
				JOptionPane.showMessageDialog(null, "You  don't deserve a compliment >:( SHOO, SHOoOO");
			}
		}
		}




		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
