interface PI1 {
 // Default method
 default void show()
 {
  // Print statement if method is called from interface 1
  System.out.println("Default PI1");
 }
}

// Interface 2
interface PI2 {
 // Default method
 default void show()
 {
  // Print statement if method is called from interface 2
  System.out.println("Default PI2");
 }
}
class code7 implements PI1, PI2 {
 // Overriding default show method
 public void show()
 {
  // Using super keyword to call the show method of PI1 interface
  PI1.super.show();

  // Using super keyword to call the show method of PI2 interface
  PI2.super.show();
 }

 // Mai driver method
 public static void main(String args[])
 {
  // Creating object of this class in main() method
  code7 d = new code7();
  d.show();
 }
}