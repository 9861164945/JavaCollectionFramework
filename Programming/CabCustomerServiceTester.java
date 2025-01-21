package com.Collectionframework.Programming;

import java.util.Scanner;

public class CabCustomerServiceTester 
{
    public static void main(String[] args) 
    {
       
        CabCustomerService Cs = new CabCustomerService();
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("How many customers would you like to add?");
        int numberOfCustomers = sc.nextInt();
        sc.nextLine(); 

        
        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.println("Enter details for Customer " + (i + 1));

           
            System.out.println("Enter customer Id:");
            int custId = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter the name of the Customer:");
            String name = sc.nextLine();

            System.out.println("Enter the pickup Location:");
            String pLoc = sc.nextLine();

            System.out.println("Enter Drop Location:");
            String dLoc = sc.nextLine();

            System.out.println("Enter Approximate distance:");
            int dist = sc.nextInt();
            sc.nextLine();  
            System.out.println("Enter mobile number:");
            long num = sc.nextLong();
            sc.nextLine();
            CabCustomer c1 = new CabCustomer(custId, name, pLoc, dLoc, dist, num);
            
           
            Cs.addCabCustomer(c1);
            Cs.printBill(c1);
            
           
            System.out.println(c1.toString());
        }
        
        // Close the scanner
        sc.close();
    }
}
