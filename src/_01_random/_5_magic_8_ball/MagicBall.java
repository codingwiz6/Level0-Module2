package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class MagicBall {
	public static void main(String[] args) {
		
		JOptionPane.showInputDialog(null, "Ask the Magic 8 ball for an answer...");
		
		Random ran = new Random();
		int ballAnswer = ran.nextInt(4);
		
		if(ballAnswer == 0) {
			JOptionPane.showMessageDialog(null, "Yes.");
		}
		else if(ballAnswer == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		else if(ballAnswer == 2) {
			JOptionPane.showMessageDialog(null, "Maybe ask Google?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Please contact your Medical Provider for any of your medical concerns.");
		}
		
		
	}
}