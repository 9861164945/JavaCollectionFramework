package com.Collectionframework.Programming;

import java.util.ArrayList;

public class Directory 
{
	private ArrayList<Employee>emps;

	
 //add employee
	public Directory()
	{
	emps=new ArrayList<Employee>();
	}

	public void addEmployee(Employee employee) {
        emps.add(employee);
    }

 //Display details of all employees
    public void displayAllEmployees() 
    {
        for (Employee employee : emps) 
        {
            System.out.println(employee);
        }
    }

 //Update employee details at a specific index
    public void updateEmployee(int index, String name, String position, double salary) 
    {
        if (index >= 0 && index < emps.size()) 
        {
            Employee employee = emps.get(index);
            employee.setName(name);
            employee.setPosition(position);
            employee.setSalary(salary);
        }
    }

 //Delete an employee at a specific index
    public void deleteEmployee(int index) 
    {
        if (index >= 0 && index < emps.size()) 
        {
            emps.remove(index);
        }
    }
	
}
