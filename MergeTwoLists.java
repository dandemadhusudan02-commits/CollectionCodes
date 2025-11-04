/**
 * Author: Madhusudan Dande
 * Program: Merge Two Lists Without Duplicates
 * Description: This program merges two lists of integers entered by the user. 
 *              It ensures that duplicate elements are not added from the second list. 
 *              The program keeps taking input until the user enters '0' to stop.
 */

package com.collection.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoLists {

    public static void main(String[] args) {
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

            // Create two lists for storing elements
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            // Input elements for the first list
            System.out.println("Enter " + n + " Elements for first List : ");
            for (int i = 0; i < n; i++)
                list1.add(sc.nextInt());

            // Input elements for the second list
            System.out.println("Enter " + n + " Elements for second List : ");
            for (int i = 0; i < n; i++)
                list2.add(sc.nextInt());

            // Merge both lists (avoid duplicates)
            List<Integer> mergedList = new ArrayList<>(list1);
            for (int num : list2)
                if (!mergedList.contains(num))
                    mergedList.add(num);

            // Display the merged list
            System.out.println("Merged List is : " + mergedList);
            System.out.println("\n");
        }
    }
}
