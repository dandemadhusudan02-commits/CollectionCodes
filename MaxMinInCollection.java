/**
 * Program Name: MaxMinInCollection
 * Author: Madhusudan Dande
 * Description:
 *   This program demonstrates how to find the maximum and minimum 
 *   elements from a list of integers using the Collections class in Java.
 *   The user enters the number of elements and the elements themselves.
 *   The program continues until the user types '0' to stop.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMinInCollection {

    public static void main(String[] args) {
    	
    		//Create Scanner class for taking input from user
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Prompt user for number of elements
            System.out.print("Enter the Number of Elements (or type '0' to stop) :  ");
            int n = sc.nextInt();

            // Exit condition
            if (n == 0) {
                System.out.println("Program Ended");
                sc.close();
                break;
            }

            // Create a List to store the elements
            List<Integer> list = new ArrayList<>();

            // Accept elements from user
            System.out.println("Enter " + n + " Elements : ");
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            // Find maximum and minimum using Collections utility methods
            System.out.println("Maximum Element => " + Collections.max(list));
            System.out.print("Minimum Element => " + Collections.min(list));

            System.out.println("\n"); // For better readability
        }
    }
}
