/**
 * Author: Madhusudan Dande  
 * Program: Find Highest Element in a List  
 * Description: This program reads a list of integers from the user and finds 
 *              the highest element using traditional sorting.  
 *              If the list has fewer than two elements, it displays an appropriate message.  
 *              The program continues running until the user enters '0' to stop.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HighestElementInList {

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
			
			// Retrieve highest element (last after sorting)
			int highest = list.get(list.size() - 1);
			System.out.println("Highest Element is >> " + highest);
			
			System.out.println();
		}
	}
}
