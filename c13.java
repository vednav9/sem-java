public class c13 {
  final int x = 10;

  public static void main(String[] args) {
    c13 myObj = new c13();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}