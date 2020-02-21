package D0211;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person("张三",'男',28);
        p1.show();
        Person p2= new Person("李四",'女',18);
        p2.show();
        Person p3= new Person("王五",'男',18);
        p3.show();
        Person p4= new Person("赵六",'男',29);
        p4.show();

        System.out.println(Person.count);
        Random rand = new Random();
        int[] a = new int[50];
        for (int i = 0; i < a.length; i++) {
            //a[i] = (int) Math.round(Math.random() * (100 - 60) + 60);
            a[i] = 60+rand.nextInt(41);
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }

    }

}
