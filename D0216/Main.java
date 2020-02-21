package D0216;

class A {
    private int i = 10;
    public void printI() {
        System.out.print(i);
    }
}
class B extends A {
    private int i = 20;
    public void printI() {
        System.out.print(i);
    }
}
public class  Main {
    public static void main(String args[]) {
        B b = new B();
        A a = b;
        b.printI();
        a.printI();
    }
}
