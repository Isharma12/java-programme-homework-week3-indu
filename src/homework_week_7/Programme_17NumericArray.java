package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Programme_17NumericArray {
    public static void main(String[] args) {
        int[] numericArray = { 5,3,6,9};
        String [] stringArray = { "apple", "banana", "date", "cherry"};

        //Sorting the numeric array in ascending order
        Arrays.sort(numericArray);
        // Sorting the String array in alphabetical order
        Arrays.sort(stringArray);
        //Printing the sorted array
            System.out.println("Sorted Numeric Array(Ascending Order):");
        for (int num : numericArray){
            System.out.println(num + " ");
            //Printing the sorted array
            System.out.println("Sorted String Array (Alphabetical order");
        for (String str : stringArray){
            System.out.println(str + " ");
        }
        }
    }
}
