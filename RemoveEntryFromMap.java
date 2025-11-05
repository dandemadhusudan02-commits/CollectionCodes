/**
 * Author: Madhusudan Dande
 * Program: Remove Entry from Map
 * Description:
 * This program demonstrates how to remove a specific key-value pair from a Map.
 * It allows the user to enter multiple key-value pairs, displays them,
 * and then removes an entry based on the user’s input.
 * The program continues to run until the user enters '0' to stop.
 */

package com.map.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveEntryFromMap {

	public static void main(String[] args) {

		// Create a Scanner object for taking user input
		Scanner sc = new Scanner(System.in);

		// Infinite loop to allow repeated execution
		while (true) {

			System.out.print("Enter the number of Entries (or type '0' to stop): ");
			int n = sc.nextInt();

			// Exit condition
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Create a HashMap to store key-value pairs
			Map<String, Integer> map = new HashMap<>();

			// Accept 'n' key-value pairs from the user
			for (int i = 0; i < n; i++) {
				System.out.print("Enter a Key (String): ");
				String key = sc.next();

				System.out.print("Enter a Value (Integer): ");
				int value = sc.nextInt();

				map.put(key, value); // Add the key-value pair to the map
			}

			// Ask user which key to remove
			System.out.print("Enter a Key to be Removed: ");
			String removedKey = sc.next();

			// Check if the entered key exists in the map
			if (map.containsKey(removedKey)) {
				map.remove(removedKey); // Remove key-value pair from map
				System.out.println("✅ Key Removed Successfully");
			} else {
				System.out.println("❌ Key Not Found");
			}

			// Display updated map after removal
			System.out.println("Updated Map is: " + map);
			System.out.println();
		}
	}
}
