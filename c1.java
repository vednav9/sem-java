import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the buffer

        System.out.print("Enter student's class: ");
        String studentClass = scanner.nextLine();

        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Class: " + studentClass);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}