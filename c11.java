abstract class Bank {
    abstract int getRateofIntrest();
}

class A extends Bank {
    int getRateofIntrest() {
        return 7;
    }
}

class B extends Bank {
    int getRateofIntrest() {
        return 8;
    }
}

public class c11 {
    public static void main(String[] args) {
        Bank b;
        b = new A();
        System.out.println("Rate of Intrest is:" + b.getRateofIntrest() + "%");
        b = new B();
        System.out.println("Rate of Intrest is:" + b.getRateofIntrest() + "%");
    }
}