package com.Collectionframework.Programming;

import java.util.Scanner;

public class EmployeeDirectory 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Directory d1 = new Directory();
        
        System.out.println("How many employees would you like to add?");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine();  
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter the name of employee " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter job position for " + name + ":");
            String pos = sc.nextLine();

            System.out.println("Enter salary for " + name + ":");
            double sal = sc.nextDouble();
            sc.nextLine();  

            Employee e = new Employee(name, pos, sal);
            d1.addEmployee(e);  
        }

        
        System.out.println("All Employees:");
        d1.displayAllEmployees();

        
        System.out.println("Enter updated information for Index wise:");
        System.out.println("Enter Index no u want to update");
        int index=sc.nextInt();
        
        System.out.println("Enter updated name:");
        String updatedName = sc.nextLine();

        System.out.println("Enter updated job position:");
        String updatedPos = sc.nextLine();

        System.out.println("Enter updated salary:");
        double updatedSal = sc.nextDouble();
        
        d1.updateEmployee(index, updatedName, updatedPos, updatedSal);
        System.out.println("After Update:");
        d1.displayAllEmployees();

        sc.close();
    }
}
