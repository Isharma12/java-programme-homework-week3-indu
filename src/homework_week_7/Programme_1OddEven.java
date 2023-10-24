package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator(? :)
 */

public class Programme_1OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        String result = (number % 2 == 0)? "even" : "odd"; //Ternary operator
        System.out.println("The input number is " + result + ".");

        sc.close();
    }
}
