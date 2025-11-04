/**
 * Program Name: ReverseList
 * Author: Madhusudan Dande
 * 
 * Description:
 *   This program reverses the elements of a List using the traditional method
 *   (without using Collections.reverse() or Java 8 features).
 *   The user provides the number of elements and their values.
 *   The program then displays the reversed list.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

	public static void main(String[] args) {
		
		//create a scanner class for taking input from user
		Scanner sc = new Scanner(System.in);

		while (true) {
			// Ask the user for the number of elements
			System.out.print("Enter number of Elements (or type '0' to stop) : ");
			int n = sc.nextInt();

			// Exit condition when user enters 0
			if (n == 0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}

			// Create a list to store elements
			List<Integer> list = new ArrayList<>();

			// Take input from the user
			System.out.println("Enter " + n + " Elements : ");
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}

			// Reverse the list using traditional two-pointer approach
			for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
				int temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}

			// Display the reversed list
			System.out.println("Reverse List is : " + list);
			System.out.println("\n");
		}
	}
}
