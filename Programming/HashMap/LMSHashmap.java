package com.Collectionframework.Programming.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class LMSHashmap 
{
    public static void main(String[] args) 
    {
        // Create a HashMap to store book titles and their availability (true = available, false = borrowed)
        HashMap<String, Boolean> lib = new HashMap<>();
        lib.put("Software Engineering", true);
        lib.put("Core Java", true);
        lib.put("Advanced Java", true);
        lib.put("React", true);
        lib.put("Javascript", false);
        lib.put("Computer Network", true);

        // Display The initial status
        System.out.println("Initial Library Status:\n" + lib);

        // Borrow a book
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book you want to borrow:");
        String bookToBorrow = sc.nextLine();
        if (lib.containsKey(bookToBorrow) && lib.get(bookToBorrow)) {
            lib.put(bookToBorrow, false);  // Mark the book as borrowed
            System.out.println(bookToBorrow + " has been borrowed.");
        } else {
            System.out.println("Either the book '" + bookToBorrow + "' is not available in the library or it is already borrowed.");
        }

        // Return a book
        System.out.println("Enter the book name you want to return:");
        String bookToReturn = sc.nextLine();
        if (lib.containsKey(bookToReturn) && !lib.get(bookToReturn)) { // Check if the book is borrowed
            lib.put(bookToReturn, true);  // Mark the book as available
            System.out.println(bookToReturn + " has been returned by the respective user.");
        } else {
            System.out.println(bookToReturn + " has not been borrowed or does not exist in the library.");
        }

        // Check the availability of a book
        System.out.println("Enter the book name to check if it's available or not:");
        String bookToCheck = sc.nextLine();
        if (lib.containsKey(bookToCheck)) {
            String availability = lib.get(bookToCheck) ? "Available" : "Borrowed";
            System.out.println(bookToCheck + " is " + availability + ".");
        } else {
            System.out.println(bookToCheck + " is not available in the library.");
        }

        // Display the final library status
        System.out.println("Final Library Status:");
        for (HashMap.Entry<String, Boolean> entry : lib.entrySet()) {
            String status = entry.getValue() ? "Available" : "Borrowed";
            System.out.println("Book: " + entry.getKey() + ", Status: " + status);
        }
    }
}
