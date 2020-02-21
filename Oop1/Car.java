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
public class Car {
    private double Oil_quantity = 0.0;     //油量

    public void setOil_quantity(double Oil_quantity) {
        this.Oil_quantity = Oil_quantity;
    }

    //行驶
    public void drive(double run){
        //百公里油耗
        double oil_consumption = 7.5;
        Oil_quantity -= run / 100 * oil_consumption;
    }
    //返回油量
    public double getOil_quantity() {
        return Oil_quantity;
    }


    public void  addGas(double Oil_quantity){
        this.Oil_quantity += Oil_quantity;
    }
}
