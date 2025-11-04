/**
 * Program Name: CommonElementsInList
 * Author: Madhusudan Dande
 * Description: This program finds and displays the common elements
 * between two lists entered by the user. It uses the retainAll() method
 * from the List interface to retain only the elements present in both lists.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElementsInList {

	public static void main(String[] args) {

		// Create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Infinite loop to allow repeated execution until user enters '0'
		while (true) {

			System.out.print("Enter the number of Elements (or type '0' to stop): ");
			int n = sc.nextInt(); // Read number of elements for both lists

			// Exit condition: if user enters 0, terminate the program
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close(); // Close the scanner to release resources
				break;
			}

			// Create two lists to store user inputs
			List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();

			// Input elements for first list
			System.out.println("Enter " + n + " Elements for first List: ");
			for (int i = 0; i < n; i++) {
				list1.add(sc.nextInt());
			}

			// Input elements for second list
			System.out.println("Enter " + n + " Elements for second List: ");
			for (int i = 0; i < n; i++) {
				list2.add(sc.nextInt());
			}

			/*
			 * retainAll() method keeps only the elements that are
			 * common in both lists and removes others from list1.
			 */
			list1.retainAll(list2);

			// Display the common elements
			System.out.println("Common Elements are >> " + list1);
			System.out.println(); // Blank line for better readability
		}
	}
}
