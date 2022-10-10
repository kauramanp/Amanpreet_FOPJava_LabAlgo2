package com.aman.lab2.questionone;

import java.util.Scanner;

public class TargetAchievementCheck {
	
	void isTargetAchieved(int targetNumber, int[] transactionItems) {
		Scanner scanner = new Scanner(System.in);
		int targetValue; // the sum of items that is to be achieved
		System.out.println("\nEnter the value of target");
		targetValue = scanner.nextInt();
		
		int itemTotal = 0; // variable to store item sum
		int iterations = 1; // variable to check the number of iterations
		Boolean isTargetAchieved = false; // flag to check is the target achieved or not

		for (int i = 0; i < targetNumber; i++) {
			itemTotal = transactionItems[i] + itemTotal;
			if (itemTotal >= targetValue) {
				isTargetAchieved = true;
				System.out.println("\nTarget achieved after " + iterations + " transactions ");
				break;
			}
			iterations++;

		}
		
		if (isTargetAchieved == false) {
			System.out.println("\nGiven target is not achieved");
		}
		
	}


}
