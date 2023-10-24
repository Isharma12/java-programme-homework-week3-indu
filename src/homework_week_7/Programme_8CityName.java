package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Programme_8CityName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet from 'A' to 'F': ");
        char input = sc.next().charAt(0);

        if (input >= 'A' && input <= 'F') {
            switch (input) {
                case 'A':
                    System.out.println("City Name: Atlanta");
                    break;
                case 'B':
                    System.out.println("City Name: Boston");
                    break;
                case 'C':
                    System.out.println("City Name: Chicago");
                    break;
                case 'D':
                    System.out.println("City Name: Dallas");
                    break;
                case 'E':
                    System.out.println("City Name: Edinburgh");
                    break;
                case 'F':
                    System.out.println("City Name: Frankfurt");
                    break;
            }
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
        }

        sc.close();
    }
}
