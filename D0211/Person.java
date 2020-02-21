package D0211;

public class Person<partner> {
    // private static boolean conut;
    //private static boolean conut;
    private final String name;
    private final char sex;
    private final int age;
    private Person partner;
    static int count;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        count++;
        //System.out.println("-------");
    }

    public void show() {
        System.out.println("姓名：" + this.name + "\t性别：" + this.sex + " \t年龄：" + this.age);
    }

//    public void showc() {
//
//
//        System.out.println("" + count + "");
//    }
//    public void marry(Person partner) {
//        this.show();
//        partner.show();
//        if(this.sex == partner.sex) {
//            System. out. println("=========同性不婚-======") ;
//            return;
//        }
//        if(this.partner != null) {
//            System. out. println("=========对方已婚======");
//            return;
//        }
//        if(partner. partner != null) {
//            System. out. println("=========对方已婚======");
//            return;
//        }
////        if (this.age != null){
////            System.out.println("男方年龄小于24，不能结婚！");
////            return ;
//        }
////
////        //将传入的对象赋值给当前对象的配偶变量
////        this.partner = partner;
////        partner.partner = this;
////        System.out.println("=======祝愿新人白头偕老=======");
//    }
}
