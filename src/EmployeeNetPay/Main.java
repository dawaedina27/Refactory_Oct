package EmployeeNetPay;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Scanner to read input.
        //scanner is the name of the Scanner object.
        //new - keyword creates a new instance (object) of the Scanner class.
        //Scanner(System.in) - calls the Scanner constructor and initializes it to take input from the standard input stream
        //System.in - This is an InputStream object that represents standard input (typically the keyboard).

        System.out.println("Enter the Gross Salary");
       double grossSalary = scanner.nextDouble();// Read double (grossSalary)

       double nssfDeduction = grossSalary * 0.11;

        double payeDeduction = grossSalary * 0.30;

        double netPay = grossSalary - nssfDeduction - payeDeduction;


        DecimalFormat Comma = new DecimalFormat("#,###.00");
        //Results display.

        System.out.println("Gross Salary: " + Comma.format(grossSalary));
        System.out.println("NSSF Salary (11%): " + Comma.format(nssfDeduction));
        System.out.println("Paye Salary (30%): " + Comma.format(payeDeduction));
        System.out.println("Net Pay: " + Comma.format(netPay));

    }
}