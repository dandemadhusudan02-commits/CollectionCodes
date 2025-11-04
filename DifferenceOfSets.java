/**
 * Program to find the difference between two sets (Set1 - Set2)
 * Author : Madhusudan Dande
 */

package com.collection.codes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class demonstrates how to find the difference between two sets using HashSet.
 * The difference operation (Set1 - Set2) returns all elements present in Set1 but not in Set2.
 */
public class DifferenceOfSets {

    public static void main(String []args) {

        // Scanner is used to take input from the user.
        // It reads the number of elements and the elements of both sets.
        Scanner sc = new Scanner(System.in);

        // Using an infinite loop to allow multiple test cases until user decides to stop.
        while (true) {

            System.out.print("Enter the number of Elements (or type '0' to stop) : ");
            int n = sc.nextInt();  // Reading number of elements for both sets

            // Exit condition for the loop
            if (n == 0) {
                System.out.println("Program Ended");
                sc.close(); // Closing the Scanner object
                break;
            }

            // Creating two HashSet objects to store unique elements
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            // Reading elements for the first set
            System.out.println("Enter " + n + " Elements for first Set : ");
            for (int i = 0; i < n; i++) {
                set1.add(sc.nextInt());
            }

            // Reading elements for the second set
            System.out.println("Enter " + n + " Elements for second Set : ");
            for (int i = 0; i < n; i++) {
                set2.add(sc.nextInt());
            }

            // Creating a new set to store the difference of Set1 and Set2
            Set<Integer> difference = new HashSet<>(set1);

            // removeAll() removes all elements of Set2 from Set1 (difference)
            difference.removeAll(set2);

            // Displaying the difference
            System.out.println("Difference is (Set1 - Set2) : " + difference);
            System.out.println("\n");
        }
    }
}
