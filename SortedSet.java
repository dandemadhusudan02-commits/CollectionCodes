/**
 * Author : Madhusudan Dande
 * Program : Accept elements from the user and store them in a TreeSet to display them in sorted order.
 * 
 * Description:
 * This program demonstrates how to use a TreeSet in Java to automatically
 * store elements in a sorted (ascending) order without duplicates.
 * The user can repeatedly enter sets of numbers until they choose to stop by typing '0'.
 */

package com.collection.codes;

import java.util.Scanner;
import java.util.TreeSet;

public class SortedSet {

    public static void main(String[] args) {

        // Create a Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Loop runs until user enters 0 to stop
        while (true) {

            System.out.print("Enter the number of elements (or type '0' to stop): ");
            int n = sc.nextInt();

            // Exit condition
            if (n == 0) {
                System.out.println("Program Ended.");
                sc.close();
                break;
            }

            // Create a TreeSet to store elements in sorted order
            TreeSet<Integer> set = new TreeSet<>();

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt()); // TreeSet automatically handles sorting and duplicates
            }

            // Display sorted elements
            System.out.println("Sorted Set (Ascending Order): " + set);
            System.out.println(); // Blank line for readability
        }
    }
}
