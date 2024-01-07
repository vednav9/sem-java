class code {
    int wt = 8;
}

class code12 extends code {
    int wt = 10; // work time

    void display() {
        System.out.println(super.wt); // will print work time of clerk
    }

    public static void main(String args[]) {
        code12 c = new code12();
        c.display();
    }
}