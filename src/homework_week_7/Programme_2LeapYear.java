package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme_2LeapYear {
        public static void main(String[] args) {
                int year;
                boolean leap = false;
                System.out.println("Enter to be checked ; ");
                Scanner sc = new Scanner(System.in);
                year = sc.nextInt();
                sc.close();

                if (year % 4 ==0) {
                        if(year % 100 == 0){
                                if(year % 400 ==0);
                                leap = true;
                        }else{
                                leap = false;
                        }
                        leap = true;
                }else{
                        leap = false;

                        System.out.println(year + " is a leap year? - " + leap);
                }
        }



        }

