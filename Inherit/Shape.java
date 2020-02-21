package Inherit;
//定义图形类Shape，该类中有获得面积的方法getArea()；定义长方形类Rect,该类是Shape的子类,类中有矩形长和宽的变量double a,double b,设置长和宽的方法
//        setWidth()、setHeight(),使用getArea()求矩形面积
public class Shape {
    public void getArea(){
        double area = 0;
        System.out.println(" 面积 ；"+area);
    }
}
