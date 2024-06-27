package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		
	//Random Drawing
		Random ran = new Random();
		
	//	int lotteryNumbers = ran.nextInt(7);
		String lotteryNumbers = "";
	//Printing Lottery Ticket
		for( int candycane = 0; candycane < 6; candycane ++) {
			int newNumber = ran.nextInt(50);
			lotteryNumbers = lotteryNumbers + newNumber + " ";
		}
		
			
			JOptionPane.showMessageDialog(null, lotteryNumbers, "Lottery Ticket", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
	
		
	}
}