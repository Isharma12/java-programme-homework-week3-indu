package homework_week_7;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */
public class Programme_9Java {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(" Enter an alphabet A to F: ");
            char alphabet = scanner.next().toUpperCase().charAt(0);

            String cityName = null;

            switch (alphabet) {
                case 'A':
                    cityName = "Atlanta";
                    break;
                case 'B':
                    cityName = "Boston";
                    break;
                case 'C':
                    cityName = "Chicago";
                    break;
                case 'D':
                    cityName = "Dallas";
                    break;
                case 'E':
                    cityName = "Edinburgh";
                    break;
                case 'F':
                    cityName = "Frankfurt";
                    break;
                default:
            }
            System.out.println("City Name: " + cityName);
            scanner.close();
        }
}

