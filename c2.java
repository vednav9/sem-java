public class c2 {

    // Method with no parameters
    public void printMessage() {
        System.out.println("No message provided.");
    }

    // Method with a single parameter of type int
    public void printMessage(int num) {
        System.out.println("Message with an integer: " + num);
    }

    // Method with a single parameter of type String
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Method with two parameters, one int and one String
    public void printMessage(int num, String message) {
        System.out.println("Message with an integer and a string: " + num + " - " + message);
    }

    public static void main(String[] args) {
        c2 example = new c2();

        // Call methods with different parameter lists
        example.printMessage();
        example.printMessage(42);
        example.printMessage("Hello, Method Overloading!");
        example.printMessage(123, "Overloading example");
    }
}


/*public class c2 {

    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y) {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y) {
        return (x + y);
    }

    public static void main(String args[]) {
        c2 s = new c2();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}*/