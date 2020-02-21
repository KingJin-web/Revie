package D0214;

public class Employee {
    private String name;
    private String address;
    private double basic;

    public Employee( String name, double basic, String address){
        this.name = name;
        this.address = address;
        this.basic = basic;
    }
    public void show(){
        System.out.printf("姓名：%s    底薪：%s   地址：%s",name, basic, address);
    }
}
