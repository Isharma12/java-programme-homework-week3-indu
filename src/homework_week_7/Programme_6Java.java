package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Programme_6Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is an even number ");
        }else{
            System.out.println(num + " is an odd number ");
        }
        sc.close();

    }
}
