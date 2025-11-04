/**
 * Program Name: SortMapByValue
 * Author: Madhusudan Dande
 * 
 * Description:
 *   This program demonstrates how to sort a Map (HashMap) by its values
 *   using traditional Java methods (without Java 8 features).
 *   The user provides key-value pairs, which are then sorted in ascending order
 *   based on their values.
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

public class SortMapByValue {

	public static void main(String[] args) {
		
		//create a scanner class for taking input from user
		Scanner sc = new Scanner(System.in);

		while (true) {
			// Ask user for number of entries
			System.out.print("Enter the number of Entries (or type '0' to stop) : ");
			int n = sc.nextInt();

			// Exit condition
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Create a HashMap to store key-value pairs
			Map<String, Integer> map = new HashMap<>();

			// Take user input for each entry
			for (int i = 0; i < n; i++) {
				System.out.println("Enter a Key (String) : ");
				String key = sc.next();

				System.out.println("Enter a Value (Integer) : ");
				int value = sc.nextInt();

				map.put(key, value);
			}

			// Convert the map entries into a list for sorting
			List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

			// Sort the list using a custom Comparator (by value)
			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// Compare values in ascending order
					return o1.getValue().compareTo(o2.getValue());
				}
			});

			// Display sorted map entries
			System.out.println("Sorted Map By Values : ");
			for (Map.Entry<String, Integer> entry : list) {
				System.out.println(entry.getKey() + " => " + entry.getValue());
			}
			System.out.println();
		}
	}
}
