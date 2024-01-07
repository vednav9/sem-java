import java.util.Scanner;  // Importing the java.util package for user input
import java.util.ArrayList; // Importing ArrayList from java.util
import java.util.Random;    // Importing Random from java.util
import java.lang.Math;      // Importing Math from java.lang

public class c3 {
    public static void main(String[] args) {
        // Using the java.util package
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);

        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        System.out.println("ArrayList: " + list);

        Random random = new Random();
        int randomValue = random.nextInt(100);
        System.out.println("Random number: " + randomValue);

        // Using the java.lang package
        double squareRoot = Math.sqrt(userInput);
        System.out.println("Square root of " + userInput + " is " + squareRoot);

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current time in milliseconds: " + currentTimeMillis);
    }
}
