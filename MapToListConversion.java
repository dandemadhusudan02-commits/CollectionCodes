/**
 * Author: Madhusudan Dande
 * Program: Convert Map to List
 * Description: 
 * This program accepts key-value pairs from the user and stores them in a HashMap.
 * After storing, it converts the map's keys and values into two separate lists:
 * one list for keys and another for values.
 * It continues execution until the user types '0' to stop.
 */

package com.map.codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapToListConversion {

	public static void main(String[] args) {

		// Create Scanner object for taking input
		Scanner sc = new Scanner(System.in);

		// Infinite loop to allow multiple test runs
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

			// Take user input for map entries
			for (int i = 0; i < n; i++) {
				System.out.print("Enter a Key (String): ");
				String key = sc.next();

				System.out.print("Enter a Value (Integer): ");
				int value = sc.nextInt();

				map.put(key, value); // Add each entry to the map
			}

			// Convert keys and values of the map into separate lists
			List<String> keyList = new ArrayList<>(map.keySet());     // List of all keys
			List<Integer> valueList = new ArrayList<>(map.values());  // List of all values

			// Display the converted lists
			System.out.println("\nList of Keys   : " + keyList);
			System.out.println("List of Values : " + valueList);
			System.out.println();
		}
	}
}
