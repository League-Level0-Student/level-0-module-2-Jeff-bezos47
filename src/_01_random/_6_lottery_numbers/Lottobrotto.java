package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottobrotto {
public static void main(String[] args) {
	
	int lotto;
	Random ran = new Random();
	lotto = ran.nextInt(99) + 1;
	int brotto;
	brotto = ran.nextInt(99 ) + 1;
	int lottobrotto;
	lottobrotto = ran.nextInt(99) + 1;
	int brottolotto = ran.nextInt(99) + 1;
	int blottorotto = ran.nextInt(99) + 1;
	int ottorbottol = ran.nextInt(99) + 1;
	
	 
	JOptionPane.showMessageDialog(null, lotto+"  "+brotto+"  "+lottobrotto+"  "+brottolotto+"  "+blottorotto+"  "+ottorbottol);		
}
}
