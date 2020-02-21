package D0210;

import java.util.Random;

/**
 * 1、定义一个长度为50的整型数数组
 * 2、随机赋值60~100，表示数学考试的成绩
 * 3、请计算求出成绩的前三名（运行并列）
 */
public class Main {
    int aa= 0;
    public static void main(String[] args) {
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
        ac(a) ;
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("前三名：");
        abc(a);
    }
    public static void ac(int[] arr){
        int temp;
        for(int i = 0; i<arr.length; i++){
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void abc(int[] arr){
        int count = 0, a = 0;
        for (int i = 0; i < 3;i++){
            a = arr[count];
            for(int j = count; j<arr.length; j++){
                if(arr[j] == a){
                    System.out.println(arr[j]);
                }
                else {
                    count = j;
                    break;
                }
            }
        }


    }
}
