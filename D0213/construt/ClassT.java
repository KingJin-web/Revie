package D0213.construt;

import java.util.Random;
import java.util.Scanner;

public class ClassT {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        start();
    }

    public static void start(){
        Classes c = new Classes();
        String n;
        while (true){
            menu();
            int q = in.nextInt();
            switch (q){

                case 1 :
                    c.show();
                    break;
                case 2 :

                    c.find();
                    break;
                case 3 :

                    c.edit();
                    break;
                case 4 :
                    return;
                default :
                    System.out.println("错误选项，请重新输入");
                    start();

            }

        }
    }
    /**
     * 菜单
     */
    public static void menu(){
        System.out.println("------学生管理系统------");
        System.out.println(" 1.查看所有学生");
        System.out.println(" 2.查找学生");
        System.out.println(" 3.修改学生");
        System.out.println(" 4.退出");
    }
}
