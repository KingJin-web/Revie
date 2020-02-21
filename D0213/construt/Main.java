package D0213.construt;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("诸葛大力","20");
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println("===================");
        Student s = new Student("张伟","00" ,"11111");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.student_id);

    }
}
