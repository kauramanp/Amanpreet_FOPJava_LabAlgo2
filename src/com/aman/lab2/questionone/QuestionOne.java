package com.aman.lab2.questionone;

import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		QuestionOne main = new QuestionOne();
		main.getValues();

	}

	// method to get the values from the user
	void getValues() {
		int transactionSize; // store the size of the array
		int targetNumber; // the iterations that can be done to achieve the target

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		transactionSize = scanner.nextInt();
		int transactionItems[] = new int[transactionSize];
		for (int i = 0; i < transactionSize; i++) {
			System.out.println("Enter the element of array to store at " + i + " position");
			transactionItems[i] = scanner.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		targetNumber = scanner.nextInt();

		TargetAchievementCheck targetAchievementCheck = new TargetAchievementCheck();
		targetAchievementCheck.isTargetAchieved(targetNumber, transactionItems);

		// ask the user whether he wants to continue or not
		// then the new target value is required
		System.out.print("\nDo you want to check with another target value \n1 : Continue \n0 : Exit");
		int isRepeat = scanner.nextInt();
		while (isRepeat == 1) {
			targetAchievementCheck.isTargetAchieved(targetNumber, transactionItems);
		}
		System.out.print("Bye");
	}

}
