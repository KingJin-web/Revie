package Oop1;

public class SodaCan {
    public static final double PI = 3.14;   //圆周率
    private double height;  //高
    private double radius;  //半径
    private double Volume;
    private double SurfaceArea;

    public void set(double height,double radius) {
        this.height = height;
        this.radius = radius;
    }

//    public void setRadius(double radius) {
//
//    }
    //表面积
    public void getSurfaceArea(){
        SurfaceArea = 2 * PI * radius * (radius + height);
    }
    //体积
    public void getVolume(){
        Volume = PI * radius *radius *height;
    }
    public void show(){
        getSurfaceArea();
        getVolume();
        System.out.println("表面积：" +SurfaceArea+"\n体积："+Volume);
    }
}
