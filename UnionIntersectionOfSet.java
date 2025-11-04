/**
 * Author : Madhusudan Dande
 * Program : Find Union and Intersection of two Sets using traditional Java methods.
 * 
 * Description:
 * This program demonstrates how to perform Union and Intersection operations 
 * on two sets of integers using the HashSet class.
 * - Union: Combines all unique elements from both sets.
 * - Intersection: Contains only common elements from both sets.
 * 
 * The program continues to execute until the user enters '0' to stop.
 */

package com.collection.codes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersectionOfSet {

    public static void main(String[] args) {
    	
    		//create scanner class for taking input from user
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of elements (or type '0' to stop): ");
            int n = sc.nextInt();

            // Exit condition for program termination
            if (n == 0) {
                System.out.println("Program Ended.");
                sc.close();
                break;
            }

            // Create two HashSets to store unique elements
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            // Input elements for first set
            System.out.println("Enter " + n + " elements for First Set:");
            for (int i = 0; i < n; i++) {
                set1.add(sc.nextInt());
            }

            // Input elements for second set
            System.out.println("Enter " + n + " elements for Second Set:");
            for (int i = 0; i < n; i++) {
                set2.add(sc.nextInt());
            }

            // Create a new set for Union operation
            Set<Integer> union = new HashSet<>(set1);
            union.addAll(set2); // Add all elements from set2 to set1

            // Create a new set for Intersection operation
            Set<Integer> intersection = new HashSet<>(set1);
            intersection.retainAll(set2); // Keep only common elements

            // Display results
            System.out.println("Union of Sets       : " + union);
            System.out.println("Intersection of Sets: " + intersection);
            System.out.println(); // Blank line for readability
        }
    }
}
