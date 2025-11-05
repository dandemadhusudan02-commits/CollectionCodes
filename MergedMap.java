/**
 * Author: Madhusudan Dande
 * Program: Merge Two HashMaps
 * Description: This program takes user input for two HashMaps (Map1 and Map2)
 *              and merges them into a single map. If both maps contain the same key,
 *              the value from the second map will overwrite the value from the first map.
 */

package com.map.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergedMap {

	public static void main(String[] args) {

		// Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Continuous loop until user chooses to stop
		while (true) {

			// Declare two HashMaps
			Map<String, Integer> map1 = new HashMap<>();
			Map<String, Integer> map2 = new HashMap<>();

			// Take input for first map
			System.out.print("Enter number of Entries for Map 1 (or type '0' to stop): ");
			int n = sc.nextInt();

			// Stop the program if user enters 0
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Accept key-value pairs for first map
			for (int i = 0; i < n; i++) {
				System.out.print("Enter a Key (String): ");
				String key = sc.next();

				System.out.print("Enter a Value (Integer): ");
				int value = sc.nextInt();

				map1.put(key, value); // Add entry to map1
			}

			System.out.println();

			// Take input for second map
			System.out.print("Enter number of Entries for Map 2 (or type '0' to stop): ");
			int num = sc.nextInt();

			// Stop the program if user enters 0
			if (num == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Accept key-value pairs for second map
			for (int i = 0; i < num; i++) {
				System.out.print("Enter a Key (String): ");
				String key = sc.next();

				System.out.print("Enter a Value (Integer): ");
				int value = sc.nextInt();

				map2.put(key, value); // Add entry to map2
			}

			// Create a new HashMap and merge both maps
			Map<String, Integer> mergedMap = new HashMap<>(map1);
			mergedMap.putAll(map2); // Adds all entries from map2 (overwrites duplicates)

			// Display the merged map
			System.out.println("\nMerged Map is : " + mergedMap);
			System.out.println();
		}
	}
}
