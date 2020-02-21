package D0218;
import	java.awt.Checkbox;

public class StuCompany extends Company {



    StuCompany(String name, int number) {
        super(name, number);
    }

    /*
    查询所有员工
     */
    public void query() {

        for (Employer e : employers) {
            e.show();
        }
    }

//    public void query1() {
//        System.out.println("男员工");
//        for (Employer e : employers) {
//            if(e.sex==1){
//
//                e.show();
//            }
//
//        }
//
//    }
//    public void query2(){
//        System.out.println("女员工");
//        for (Employer e : employers) {
//            if(e.sex==0){
//
//                e.show();
//            }
//
//        }
//    }
    public void AddSdlary(int money,Checker checker){
        for (Employer e :employers){
            if (checker.condition(e)){
                e.salary += money;
                e.show();
            }
        }

    }

    public static void main(String[] args) {
        StuCompany sc = new StuCompany("tenx",100);
        sc.query();
//        sc.query1();
//        sc.query2();
        System.out.println("===========================");
        sc.AddSdlary(100,new ManChecker());
        System.out.println("===========================");
        sc.AddSdlary(100,new WomanChecker());

    }

    static class ManChecker implements Checker{
        public boolean condition(Employer e) {
            return e.sex == 1;
        }
    }

    static class WomanChecker implements Checker{
        public boolean condition(Employer e) {
            return e.sex == 0&& e.salary >7000;
        }
    }
/**
 *给只会一门技术的男员工减薪200
 */
    static class ManChecker1 implements Checker{
//    int count = 0;
//            if (e instanceof Java) {
//        count++;
//    }
//            if (e instanceof Html) {
//        count++;
//    }
//            if (e instanceof MySQL) {
//        count++;
//    }
        public boolean condition(Employer e) {
            return e.sex == 1;
        }
    }

/*水水
*给所有会Java和Html 的女员工加薪500
*/

    static class WomanChecker1 implements Checker{
        public boolean condition(Employer e) {
            return e.sex == 1;
        }
    }
}
interface Checker {
    /*
    判断员工是否符合条件
     */
    boolean condition(Employer e);

}
interface Checker1 {
    /*
    判断员工是否符合条件
     */
    boolean condition(Employer e);

}
interface Java {

}

interface Html {
}

interface MySQL {
}
