/**
 * Author: Madhusudan Dande
 * Program: Convert List to Set and Back
 * Description: This program demonstrates how to convert a List (which allows duplicates)
 *              into a Set (which removes duplicates), and then convert the Set back into a List.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ConvertListToSetAndBack {

	public static void main(String[] args) {

		// Create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Infinite loop to allow multiple test runs until user stops
		while (true) {

			// Ask the user how many elements they want to enter
			System.out.print("Enter the number of Elements (or type '0' to stop) : ");
			int n = sc.nextInt();

			// Exit condition
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Create a List to store elements (List allows duplicates)
			List<Integer> list = new ArrayList<>();

			// Input 'n' elements into the List
			System.out.println("Enter " + n + " Elements (Allowing Duplicates) : ");
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}

			// Convert List to Set to remove duplicates (Set doesn't allow duplicates)
			Set<Integer> set = new HashSet<>(list);
			System.out.println("Converted List to Set (Duplicates Removed): " + set);

			// Convert Set back to List
			List<Integer> list1 = new ArrayList<>(set);
			System.out.println("Converted Set back to List: " + list1);

			System.out.println("\n"); // Line break for clarity
		}
	}
}
