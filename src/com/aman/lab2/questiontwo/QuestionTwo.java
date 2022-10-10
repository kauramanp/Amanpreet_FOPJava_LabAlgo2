package com.aman.lab2.questiontwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QuestionTwo {
	public static void main(String args[]) {
		int denominationSize;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of currency denominations");
		denominationSize = scanner.nextInt();
		int denominationArray[] = new int[denominationSize];
		for (int i = 0; i < denominationSize; i++) {
			System.out.println("Enter the currency denomination to store at " + i + " position");
			denominationArray[i] = scanner.nextInt();
		}

		System.out.print("Enter the amount you want to pay");
		int amountToPay = scanner.nextInt();
		Arrays.sort(denominationArray);

		int tempAmount = amountToPay;
		System.out.print("Your payment approach in order to give min no of notes will be\n");
		int amountLeft = 0;
		while (tempAmount > 0) {
			int i = 0;
			for (i = (denominationArray.length - 1); i >= 0; i--) {
				int notesRequired = 0;
				while (tempAmount >= denominationArray[i]) {
					if (tempAmount >= i) {
						tempAmount -= denominationArray[i];
						notesRequired++;
					}
				}

				if (notesRequired > 0) {
					System.out.println(denominationArray[i] + " : " + notesRequired);
				}
			}
		}

	}

}
