package homework_week_7;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme_18SumArray {
    public static void main(String[] args) {
        //Create an array of integers
        int[] numbers = {1,2, 3, 4,5};

        //Initialize a variable to store the sum
        int sum = 0;

        //Iterate through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        //Print the sum
        System.out.println("Sum of the array elements is: " + sum);
    }
}
