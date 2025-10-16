package com.learning;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        try( Scanner sc = new Scanner(System.in) ) {
            System.out.println("Welcome to Employee Management System!");
            System.out.println("--------------------------------------");
            System.out.println("1. ADD Employee Details");
            System.out.println("2. Get All Employees Details");
            System.out.println("3. Get a Employee Detail");
            System.out.println("4. Delete a Employee Detail");
            System.out.println("Choose any 1 Option(1-4): ");
            int choice = sc.nextInt();

            
            switch (choice) {
                case 1:
                    System.out.println("Enter Employee Id:");
                    int emp_id = sc.nextInt();
                    System.out.println("Enter Employee First Name:");
                    String emp_first_name = sc.next();
                    System.out.println("Enter Employee Last Name:");
                    String emp_last_name = sc.next();
                    System.out.println("Enter Employee Age:");
                    int emp_age = sc.nextInt();
                    Add addEmp = new Add(emp_id, emp_first_name, emp_last_name, emp_age);
                    addEmp.AddEmployeeDetails();
                    break;
                case 2:
                    Get getEmp = new Get();
                    getEmp.GetAllEmployeeDetails();
                    break;
                case 3:
                    System.out.println("Enter Employee Id to get Details:");
                    int get_emp_id = sc.nextInt();
                    GetbyID getbyid = new GetbyID(get_emp_id);
                    getbyid.GetEmployeeById();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong! "+e);
        }
    }
}
