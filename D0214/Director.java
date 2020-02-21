package D0214;

public class Director extends Employee {
    public double transportAllowance;//是津贴
    public Director(String name, double basic, String address, double transportAllowance) {
        super(name, basic, address);
        this.transportAllowance = transportAllowance;
    }
    public void show(){
//        System.out.println("姓名：" + name + "\t地址："+ address +"\t底薪："
//                + basic +  "\t津贴"+ transportAllowance +" ");
        super.show();
        System.out.println("\t津贴"+ transportAllowance );

    }
}
