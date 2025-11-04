/**
 * Author: Madhusudan Dande
 * Program: Compare Two Lists
 * Description: This program takes two lists of integers as input from the user and 
 *              compares them to check whether both contain the same elements (regardless of order).  
 *              The lists are sorted before comparison to ensure order-independent checking.  
 *              The program continues until the user enters '0' to stop.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CompareTwoLists {

	public static void main(String []args) {
		
		//create scanner class for taking input from user
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			// Taking number of elements from the user
			System.out.print("Enter the number of Elements (or type '0' to stop) : ");
			int n = sc.nextInt();
			
			// Exit condition
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}
			
			// Creating two lists
			List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			
			// Taking input for the first list
			System.out.println("Enter " + n + " Elements for first List : ");
			for (int i = 0; i < n; i++) {
				list1.add(sc.nextInt());
			}
			
			// Taking input for the second list
			System.out.println("Enter " + n + " Elements for second List : ");
			for (int i = 0; i < n; i++) {
				list2.add(sc.nextInt());
			}
			
			// Assume both lists are equal initially
			boolean isEqual = true;
			
			// If sizes differ, they cannot be equal
			if (list1.size() != list2.size()) {
				isEqual = false;
			}
			
			// Sort both lists to compare irrespective of element order
			Collections.sort(list1);
			Collections.sort(list2);
			
			// Compare elements one by one
			for (int i = 0; i < list1.size(); i++) {
				if (!list1.get(i).equals(list2.get(i))) {
					isEqual = false;
					break;
				}
			}
			
			// Display the result
			if (isEqual) {
				System.out.println("Both Lists are Equal");
			} else {
				System.out.println("Both Lists are not Equal");
			}
			
			System.out.println();
		}
	}
}
