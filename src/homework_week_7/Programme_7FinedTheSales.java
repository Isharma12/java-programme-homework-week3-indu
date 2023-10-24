package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Programme_7FinedTheSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double commissionRate = 0.0;

        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }

        double commission = salesAmount * commissionRate;
        double totalSalary = basicSalary + commission;

        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
        System.out.println("Commission: $" + commission);
        System.out.println("Total Salary: $" + totalSalary);

        scanner.close();
    }
}