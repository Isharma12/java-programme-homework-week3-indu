package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme_10Symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation symbol.");
        }
    }

}
