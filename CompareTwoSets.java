/**
 * Program to compare two sets for equality.
 * Author : Madhusudan Dande
 */

package com.collection.codes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class demonstrates how to compare two sets using HashSet.
 * Two sets are considered equal if:
 *  - They have the same size
 *  - They contain exactly the same elements (order doesn’t matter)
 */
public class CompareTwoSets {

    public static void main(String[] args) {

        // Scanner class is used for taking input from the user
        Scanner sc = new Scanner(System.in);

        // Using a loop to allow multiple comparisons until user enters 0
        while (true) {

            System.out.print("Enter the number of Elements (or type '0' to stop) : ");
            int n = sc.nextInt(); // Number of elements for each set

            // Exit condition
            if (n == 0) {
                System.out.println("Program Ended");
                sc.close(); // Closing Scanner to release system resources
                break;
            }

            // Creating two HashSets to store unique elements for both sets
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            // Input for first set
            System.out.println("Enter " + n + " Elements for first Set : ");
            for (int i = 0; i < n; i++) {
                set1.add(sc.nextInt());
            }

            // Input for second set
            System.out.println("Enter " + n + " Elements for second Set : ");
            for (int i = 0; i < n; i++) {
                set2.add(sc.nextInt());
            }

            // Flag variable to store comparison result
            boolean isEqual = true;

            // Step 1: If sizes are not same, sets cannot be equal
            if (set1.size() != set2.size()) {
                isEqual = false;
            } 
            // Step 2: If sizes are same, check if contents are same
            else if (!set1.equals(set2)) {
                isEqual = false;
            }

            // Display result
            if (isEqual) {
                System.out.println("✔ Both Sets Are Equal");
            } else {
                System.out.println("❌ Both Sets Are Not Equal");
            }

            System.out.println("\n");
        }
    }
}
