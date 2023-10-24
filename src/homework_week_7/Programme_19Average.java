package homework_week_7;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Programme_19Average {
    public static void main(String[] args) {
        // Initialize an array with values
        double[] values = { 10.5, 20.2, 30.0, 40.8, 50.2 };

        // Calculate the sum of the elements
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }

        // Calculate the average
        double average = sum / values.length;

        // Display the average
        System.out.println("Average: " + average);
    }

}
