/**
 * Author: Madhusudan Dande
 * Program: Search Key and Value in a Map
 * Description: This program demonstrates how to insert key-value pairs into a HashMap,
 *              and how to check whether a specific key or value exists in the map.
 */

package com.map.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyValueInMap {

	public static void main(String[] args) {

		// Create a Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Use a while loop to repeatedly take input until the user stops
		while (true) {

			// Ask the user for number of entries
			System.out.print("Enter the number of Entries (or type '0' to stop) : ");
			int n = sc.nextInt();

			// Exit condition — if user enters 0, stop the program
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Create a HashMap to store String keys and Integer values
			Map<String, Integer> map = new HashMap<>();

			// Take 'n' key-value pairs from the user
			for (int i = 0; i < n; i++) {
				System.out.print("Enter a Key (String) : ");
				String key = sc.next(); // read the key

				System.out.print("Enter a Value (Integer) : ");
				int value = sc.nextInt(); // read the value

				// Add key-value pair into the map
				map.put(key, value);
			}

			// Ask user to input a key and a value to search
			System.out.print("Enter a Key to Search (String) : ");
			String searchKey = sc.next();

			System.out.print("Enter a Value to Search (Integer) : ");
			int searchValue = sc.nextInt();

			// Check if the entered key exists in the map
			if (map.containsKey(searchKey)) {
				System.out.println("✅ Key is Found");
			} else {
				System.out.println("❌ Key is Not Found");
			}

			// Check if the entered value exists in the map
			if (map.containsValue(searchValue)) {
				System.out.println("✅ Value is Found");
			} else {
				System.out.println("❌ Value is Not Found");
			}

			System.out.println("\n"); // print a blank line for better readability
		}
	}
}
