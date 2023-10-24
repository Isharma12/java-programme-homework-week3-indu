package homework_week_7;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Programme_20Value { public static void main(String[] args) {
    // Sample array
    int[] numbers = {1, 2, 3, 4, 5};

    // Value to search for
    int targetValue = 3;

    // Flag to indicate whether the value is found
    boolean found = false;

    // Iterate through the array
    for (int number : numbers) {
        if (number == targetValue) {
            found = true;
            break; // Exit the loop early since the value is found
        }
    }

    // Check if the value is found
    if (found) {
        System.out.println("The array contains the value " + targetValue);
    } else {
        System.out.println("The array does not contain the value " + targetValue);
    }
}
}








