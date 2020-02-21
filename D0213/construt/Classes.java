package D0213.construt;
//作业一：
//        设计一个班级学生管理系统,要求如下:
//        1.班级共有三十名学生，首先请在系统中初始化他们的姓名和年龄.
//        2. 提供查找所有的学生信息的方法
//        3. 提供根据姓名查找学生的方法，并将查出来的学生信息显示出来,  使用 == 比较名字是否相同
//        4. 提供根据姓名查找学生并修改学生的年龄的方法.
//        类结构设计参照如下:


import java.util.Scanner;

public class Classes<students> {

    Student s1 = new Student("2019001", "张三", "19");
    Student s2 = new Student("2019002", "李四", "20");
    Student s3 = new Student("2019003", "王五", "19");
    Student s4 = new Student("2019004", "赵六", "19");
    Student s5 = new Student("2019005", "张伟", "19");
    Student s6 = new Student("2019006", "诸葛", "19");
    Student s7 = new Student("2019007", "小明", "19");
    Student s8 = new Student("2019008", "陈真", "19");
    Student s9 = new Student("2019009", "成龙", "19");
    Student s10= new Student("2019010", "陈栋", "19");
    Student s11= new Student("2019011", "许仙", "19");
    Student s12= new Student("2019012", "徐贤", "19");
    Student s13= new Student("2019013", "吕布", "19");
    Student s14= new Student("2019014", "张飞", "19");
    Student s15= new Student("2019015", "宋殃", "19");
    Student s16= new Student("2019016", "黄渤", "19");
    Student s17= new Student("2019017", "吴京", "19");
    Student s18= new Student("2019018", "杨过", "19");
    Student s19= new Student("2019019", "杨康", "19");
    Student s20= new Student("2019020", "郭靖", "19");
    Student s21= new Student("2019021", "吴浩", "19");
    Student s22= new Student("2019022", "张勇", "19");
    Student s23= new Student("2019023", "吴迪", "19");
    Student s24= new Student("2019024", "刘静", "19");
    Student s25= new Student("2019025", "小红", "19");
    Student s26= new Student("2019026", "Jack", "19");
    Student s27= new Student("2019027", "Bob", "19");
    Student s28= new Student("2019008", "诸葛大力", "19");
    Student s29= new Student("2019029", "蔡徐坤", "19");
    Student s30= new Student("2019030", "乔碧萝", "19");

    private Student[] students ={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,
            s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s28,s29,s30} ;


    /**
     * 提供查找所有的学生信息的方法
     */
    public void query() {


    }

    /**
     * 提供根据姓名查找学生的方法，并将查出来的学生信息显示出来
     */
    public void find() {
        Scanner in = new Scanner(System.in);
        System.out.println("输入要查找的学生姓名");
        String name = in.nextLine();


        for (int i = 0; i < students.length; i++){
            if (students[i].name.equals(name)) {
                System.out.println("找到了：");
                System.out.println("学号："+students[i].student_id+"\t姓名："+
                        students[i].name+"\t年龄："+students[i].age);
            }
        }

    }

    /**
     * 提供根据姓名查找学生并修改学生的年龄的方法.
     */
    public void edit() {
        Scanner in = new Scanner(System.in);
        System.out.println("输入要修改的学生姓名");
        String name =  in.nextLine();
        for (int i = 0; i < students.length; i++){
            if (students[i].name.equals(name)) {
                System.out.println("找到了：");
                System.out.println("学号："+students[i].student_id+"\t姓名："+
                        students[i].name+"\t年龄："+students[i].age);
                System.out.println("更改年龄为：");
                students[i].age = in.nextLine();
            }
        }
    }

    public void show(){
        for (int i = 0; i < students.length;i++) {

            System.out.println("学号："+students[i].student_id+"\t姓名："+
                    students[i].name+"\t年龄："+students[i].age);
        }
        System.out.println(students.length);
    }
}
