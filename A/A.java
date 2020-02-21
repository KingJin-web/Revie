package A;


//public class A {
//    A() {
//        System.out.println("parent");
//    }
//}
//class Child extends A {
//    Child(String s) {
//        System.out.println(s);
//    }
//    public static void main(String[] args) {
//        Child child = new Child("child");
//    }
//}
//public class A {
//    public int count() {
//        return 0;
//    }
//}
// class Test extends A {
//    private int i;
//    public int count() {
//        return i % 9;
//        // 第3行
//    }
//}.3
public class A {
    public static int aMethod(int i)throws Exception{
        try{
            return i / 10;
        } catch (Exception ex) {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }
    public static void main(String [] args)     {
        try  {
            aMethod(0);
        } catch (Exception ex){
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}