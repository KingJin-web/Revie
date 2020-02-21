package D0214;

public class Manger extends Employee {
    private String department;

    public Manger(String name, double basic, String address, String department) {
        super(name, basic, address);
        this.department = department;
    }
    public void show(){
        super.show();
        System.out.println("部门：" + department);
    }
}
