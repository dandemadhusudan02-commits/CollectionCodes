/**
 * Author: Madhusudan Dande
 * Program: Add and Display Map Entries
 * Description: This program demonstrates how to add key-value pairs into a HashMap
 *              using user input, and then display all the entries in the map.
 */

package com.map.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddDisplayMap {

	public static void main(String[] args) {

		// Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Infinite loop to continuously take user input until '0' is entered
		while (true) {

			// Ask the user how many key-value pairs they want to enter
			System.out.print("Enter number of Entries (or type '0' to stop) : ");
			int n = sc.nextInt();

			// Exit condition — if user enters 0, terminate the program
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Create a HashMap to store String keys and Integer values
			Map<String, Integer> map = new HashMap<>();

			// Take 'n' key-value pairs from user
			for (int i = 0; i < n; i++) {
				System.out.println("Enter a key (String) : ");
				String key = sc.next(); // Read the key from user

				System.out.println("Enter a value (Integer) : ");
				int value = sc.nextInt(); // Read the value from user

				// Put the key-value pair into the map
				map.put(key, value);
			}

			// Display all entries of the map
			System.out.println("\nMap Entries are : ");
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " => " + entry.getValue());
			}

			System.out.println("\n"); // Add a line break for readability
		}
	}
}
