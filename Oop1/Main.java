package Oop1;
//1、实现一个具有以下特性的Car类。一辆汽车有一定的燃油效率
//        (测量单位可以是英里/千米)并且油箱中有一定的油量。
//        效率在构造函数中确定，初始油量为0.提供一个drive()
//        方法模拟汽车行驶一定的距离并减少油箱油量。
//        再提供一个返回当前油量的getGas方法和一个用于加油的
//        addGas方法。用法示例如下:
//        Car myHybrid=new Car(49);
//        myHybrid.addGas(20);
//        myHybrid.drive(100);
//        System.out.println(myHybrid.getGas());
//2、实现一个SodaCan类，它有getSurfaceArea()和getVolume()
//        方法.在构造函数中，提供圆柱的高和半径.
//3、编写一个程序，提示用户输入一个以米为单位的度量值，
//        然后将其换算为英里数、英尺数和英寸数。使用下面的类:
//        public class Converter{
//            //@param aConversionFactor 换算为目标单位时所使用的换算因
//            public Converter(double aConversionFactor){…}
//            //@param fromMeasurement 度量值（单位：米）
//        //@return 换算为目标单位的输入值
//            public double convertTo(double fromMeasurement){…}
//        }
//        构造3个与下例类似的实例:
//        final double MILE_TO_KM=1.609; // Java常量定义
//        Converter milesToMeters=new Converter(1000*MILE_TO_KM);
//4、编写一个包含名为Calculator类的程序。
//        定义两个整型属性以及对该两个变量的setter和getter，
//        编写用于对两个属性执行加、减、乘、除运算方法。
//        在main方法里创建该类的对象并访问这些方法。
//5、编写一个名为Box的类，含整型的height,width,length，
//        volume四个属性，要求在构造方法中将其初始化，
//        并定义一个计算体积的calcVolume方法和一个输出
//        体积的print方法，在main方法中进行调用。
//6、写一个类用来模拟栈这种数据结构，要求底层使用数组存储数据，并给出
//        进栈和出栈的方法
//7、写一个类Person,包含以下属性：
//        String name;
//        int age;
//        String gender;
//        Person partner。
//        为Person类写一个marry(Person p)方法，代表当前对象和p结婚，
//        如若可以结婚，则输出恭贺信息，否则输出不能结婚原因。
//        要求在另外一个类中写一个主方法，来测试以上程序。
//        （下列情况不能结婚：
//        1，同性；
//        2，未达到结婚年龄，男<24，女<22；
//        3，某一方已婚）
// 8、写以下类：
//        飞机： 型号，最大座位数，最大航程。
//        航班： 航班号，航空公司名称，航空公司代号，航班日期，出发
//        到达时间，里程，使用飞机，剩余座位，全价，折扣率。
//        方法：setPlane(Plane p);
//        客户： 姓名，身份证号，帐户余额。
//        方法：order(Flight f);

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Random rand = new Random();
        //System.out.println(a);
        int []aa = new int[a];
        for (int b = 0; b < a;b++){
            aa[b] = rand.nextInt(100);
        }
        System.out.println(aa[aaal()]);
        for (int b = 0; b < a;b++){
            System.out.print(aa[b]+" ");
        }
    }
    public static int aaal(){
        int 你爸爸;
        Random rand = new Random();
        return rand.nextInt(10);
    }
}
