package D0215;

//在类的继承体系结构中，如果子类中出现了与父类中有同原型(方法的签名)的方法, 那么认为子类中的方法覆盖了父类中的方法(也称为方法重写;
//        同原型:同名、同参、同返回值、访问修饰符不能小于父类
//  public
//  protect
//  默认
//  private
//重写:子类、同名、同参、同返回值
//重载:同类、同名、不同参数

public class Parent {
    String name = "张三";
    String like ;
    public void show(){
        System.out.println(this.name);

    }

    public static void main(String[] args) {
//        Children children = new Children();
//        children.show();
//        System.out.println("=================");
//        Parent p = new Children();
//        p.show();

        Children c1 = new Children();
        Parent p1 = c1;
        c1.like = "打篮球 ";
        c1.name = "蔡徐坤 ";
        c1.edu = "大学";
//        System.out.println(c1.name);
//        System.out.println(c1.like);
//        System.out.println(c1.edu);
//        System.out.println("=================");
//        System.out.println(p1.like);
//        System.out.println(p1.name);


        System.out.println("=======方法测试========");
        p1.show();
        c1.show();
        System.out.println("=======属性测试========");
        System.out.println(p1.name);
        System.out.println(c1.name);
    }
}

class Children extends Parent {
    String name = "李四"; //重写属性
    String edu ; //扩展属性
    public void show() {
        super.show();
        System.out.println(this.name);
    }
}