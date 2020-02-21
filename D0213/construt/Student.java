package D0213.construt;

public class Student extends Person {
    String student_id;

    public Student(String student_id,String name ,String age) {
        super(name, age);
        this.student_id = student_id;
    }


}
