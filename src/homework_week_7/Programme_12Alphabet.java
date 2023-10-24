package homework_week_7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */


public class Programme_12Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String input = sc.nextLine();

        if(input.length() == 1){
            char character = input.charAt(0);
            if(Character.isDigit(character)) {
                System.out.println(" You entered a number.");
            }else if(Character.isLetter(character)) {
                System.out.println("You entered an alphabet letter.");
            }else{
                System.out.println("You entered a symbol.");
            }
        }else{
            System.out.println("Invalid input. Please enter a single character.");
        }sc.close();
    }
}
