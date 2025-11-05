/**
 * Author: Madhusudan Dande
 * Program: Find Highest and Lowest Values in a Map
 * Description: This program allows the user to enter key-value pairs into a HashMap
 *              and then finds the maximum and minimum values using the Collections class.
 */

package com.map.codes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestValueInMap {

	public static void main(String[] args) {

		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Repeat until user decides to stop
		while (true) {
			System.out.print("Enter number of Entries (or type '0' to stop): ");
			int n = sc.nextInt(); // take number of entries

			// Exit condition
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Create a HashMap to store key-value pairs (String -> Integer)
			Map<String, Integer> map = new HashMap<>();

			// Accept 'n' entries from user
			for (int i = 0; i < n; i++) {
				System.out.print("Enter a Key (String): ");
				String key = sc.next(); // read key

				System.out.print("Enter a Value (Integer): ");
				int value = sc.nextInt(); // read value

				// Insert key-value pair into the map
				map.put(key, value);
			}

			// Find the maximum and minimum values from the map using Collections utility methods
			int max = Collections.max(map.values()); // finds highest value
			int min = Collections.min(map.values()); // finds lowest value

			// Display the results
			System.out.println("\nMaximum Value is : " + max);
			System.out.println("Minimum Value is : " + min);
			System.out.println();
		}
	}
}
