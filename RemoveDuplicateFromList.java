/**
 * Program Name: RemoveDuplicateFromList
 * Author: Madhusudan Dande
 * Description: This program removes duplicate elements from a list using Set.
 * It takes input from the user using the Scanner class and displays the
 * unique elements after removing duplicates.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {

		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Infinite loop to allow multiple test runs until user enters '0'
		while (true) {

			System.out.print("Enter Number Of Elements (or type '0' to stop): ");
			int n = sc.nextInt(); // Reading number of elements

			// If user enters '0', stop the program
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close(); // Closing scanner to release system resources
				break;
			}

			// Create a List to store elements entered by user
			List<Integer> list = new ArrayList<>();

			System.out.println("Enter " + n + " Elements: ");
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt()); // Adding user input to list
			}

			// Using HashSet to automatically remove duplicate elements
			Set<Integer> set = new HashSet<>(list);

			// Display the unique elements
			System.out.println("After Removing Duplicates: " + set);
			System.out.println(); // Blank line for better readability
		}
	}
}
