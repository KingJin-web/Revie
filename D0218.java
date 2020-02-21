public class D0218 {
    public static void Main(String[] args) {
        Class2 o=new Class2();
        o.MethodA();
    }
}
abstract class BaseClass
{
    public void MethodA() {
        System.out.println("BaseClass");
    }
    public void MethodB() {

    }
}
class Class1 extends BaseClass
{
    public void MethodA() {
        System.out.println("Class1");
    }
    public void MethodB(){

    }
}
class Class2 extends Class1 {
    public void MethodB(){

    }
}
class MainClass {
    public static void Main(String[] args) {
        Class2 o=new Class2();
        o.MethodA();
    }
}