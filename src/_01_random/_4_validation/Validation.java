//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		System.out.println("Do you want some Validation?? Here you go: ");
		for(int i = 0; i < 10 ; i++) {
		
		int randomNumber = randomMaker.nextInt(5);
		
		//System.out.println(randomNumber);

		if(randomNumber == 0) {
			System.out.println("Yo, I like your style.");
		}
		else if(randomNumber == 1) {
			System.out.println("Cool Shirt!");
		}
		else if(randomNumber == 2) {
			System.out.println("Awesome Shoes.");
		}
		else if(randomNumber == 3) {
			System.out.println("Great Pants!");
		}
		else {
			System.out.println("Such an well established outfit!");
		}
		}
		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
