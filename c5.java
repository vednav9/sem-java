import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        // Create a 2D array based on user input
        int[][] twoDArray = new int[numRows][numCols];

        // Prompt the user to enter elements for the 2D array
        System.out.println("Enter the elements for the 2D array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        // Display the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
/*
 * import java.util.ArrayList; // Import ArrayList from java.util package
import java.util.Date;      // Import Date from java.util package
import java.lang.Math;      // Import Math from java.lang package

public class c5 {
    public static void main(String[] args) {
        // Using java.util package - ArrayList
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");

        System.out.println("Names List: " + namesList);

        // Using java.util package - Date
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        // Using java.lang package - Math
        double number = 16.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square Root of " + number + " is " + squareRoot);
    }
}
 */