/**
 * Author: Madhusudan Dande  
 * Program: Find Second Highest Element in a List  
 * Description: This program reads a list of integers from the user and finds 
 *              the second highest element using traditional sorting.  
 *              If the list has fewer than two elements, it displays an appropriate message.  
 *              The program continues running until the user enters '0' to stop.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondHighestElementInList {

	public static void main(String[] args) {
		
		//create Scanner class for taking input from user
		Scanner sc = new Scanner(System.in);

		while (true) {
			// Ask user for number of elements
			System.out.print("Enter the number of Elements (or type '0' to stop) : ");
			int n = sc.nextInt();

			// Exit condition
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Create list to store elements
			List<Integer> list = new ArrayList<>();

			// Input list elements
			System.out.println("Enter " + n + " Elements : ");
			for (int i = 0; i < n; i++)
				list.add(sc.nextInt());

			// Sort the list in ascending order
			Collections.sort(list);

			// Check if there are enough elements to find the second highest
			if (list.size() < 2) {
				System.out.println("Not Enough Elements to find Second Highest Element");
			} else {
				// Retrieve second highest element (second last after sorting)
				int secondHighest = list.get(list.size() - 2);
				System.out.println("Second Highest Element is >> " + secondHighest);
			}
			System.out.println();
		}
	}
}
