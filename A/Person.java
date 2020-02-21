package A;
//
//
////public class Person {
////    public static int aMethod(int i)throws Exception{
////        try{
////            return i / 10;
////        } catch (Exception ex) {
////            throw new Exception("exception in a Method");
////        } finally{
////            System.out.printf("finally");
////        }
////    }
////    public static void main(String [] args)     {
////        try  {
////            aMethod(0);
////        } catch (Exception ex){
////            System.out.printf("exception in main");
////        }
////        System.out.printf("finished");
////    }
////}
//class Person{
//    public Base(String s){
//        System.out.print("B");
//    }
//}
//
// class Derived extends Person{
//    public Derived (String s) {
//        System.out.print("D");
//    }
//    public static void main(String[] args){
//        new Derived("C");
//    }
//}

//2.在任意一个四位整数中，如果该数的个位数和百位数之
//        和大于16，并且十位数和千位数之和小于3，就称这种数
//        6
//        为“老九幸运数
//        请小伙伴编程计算出在1000~9999中,
//        一共有多少个满足老九幸运数的四位整数呢，打印出最终的
//        个数!
public class Person{
    public static void main(String[] args) {
        int c = 0;
        for (int i =1000 ; i < 10000; i++){
            int qian =i/1000; //千位除以1000
            int bai = i/100%10;//百位除以100%10
            int shi = i%100/10;//十位%100/10
            int ge  = i%10;//个位直接%10
            if (ge + bai > 16&&qian +shi<3){
                c ++;
                System.out.println(i);

            }
        }
        System.out.println(c);
    }

}