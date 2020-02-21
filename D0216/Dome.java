package D0216;


//
//        抽象类
//        抽象方法:是没有方法体的方法，在参数列表后面直接用;结束方法的定义
//
//
//        1、抽象类是用abstract修饰的类
//        2、有抽象方法的类一定是抽象类
//        3、抽象类不一定有抽象方法
//        4、抽象类不能直接创建
//        5、抽象类希望子类继承抽象类
//        The type Demo2 must be an abstract class to define abstract methods
//        当一个类中定义了一个抽象方法，那么该一定也是抽象类


//import D0213.Teacher;
//import D0215.Parent;

public abstract class Dome {
//      方法定义必要元素
//        1.返回值
//        2.方法名
//        3.参数列表
//        4.方法体

   abstract void test();

   public void test1(){
       Person p = new Teacher();
       p.play();

   }
}
abstract class Person{
    String name;

    abstract void work();
    abstract void play();

}


class Teacher extends Person{
    void work(){
        System.out.println(" ");
    }


    void play() {

    }
}
abstract class  Worker extends Person{

}
class Progarmer extends Person{
    void work(){
        System.out.println(" ");
    }

    @Override
    void play() {

    }
}
