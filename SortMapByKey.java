/**
 * Program Name : SortMapByKey
 * Author       : Madhusudan Dande
 * Description  : This program takes a map (key-value pairs) as input from the user
 *                and sorts it in ascending order based on the keys using the traditional method.
 *                
 * Concept Used : Collections.sort() with custom Comparator for sorting Map Entries by Key.
 * 
 * Note         : Java 8 Streams are not used — only traditional approach is applied.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortMapByKey {

	public static void main(String[] args) {

		// Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Infinite loop to allow multiple test cases until user types '0'
		while (true) {
			System.out.print("Enter the number of Entries (or type '0' to stop) : ");
			int n = sc.nextInt();

			// Exit condition for loop
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Step 1: Create a HashMap to store user input (key-value pairs)
			Map<String, Integer> map = new HashMap<>();

			// Step 2: Take user inputs for map entries
			for (int i = 0; i < n; i++) {
				System.out.println("Enter a Key (String) : ");
				String key = sc.next();
				System.out.println("Enter a Value (Integer) : ");
				int value = sc.nextInt();

				map.put(key, value);
			}

			// Step 3: Convert the Map into a List of Entries (for sorting)
			List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

			// Step 4: Sort the list using Collections.sort() and custom Comparator
			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// Compare the keys alphabetically
					return o1.getKey().compareTo(o2.getKey());
				}
			});

			// Step 5: Display the sorted entries
			System.out.println("\nSorted Map By Keys:");
			for (Map.Entry<String, Integer> entry : list) {
				System.out.println(entry.getKey() + " => " + entry.getValue());
			}

			System.out.println(); // Empty line for readability
		}
	}
}
