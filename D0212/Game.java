package D0212;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static int i = 0, j = 0;
    private static Random rd = new Random();
    private static Scanner in = new Scanner(System.in);
    private static final int SIZE = 10;
    private static int[][] board = new int[SIZE][SIZE];

    /**
     * 开始游戏
     */

    public static void start() {
        init();
        UpsetArr(board);
        printarr(board);
        while(true){
            System.out.println("输入消除的两点坐标：");
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();

            boolean a =check(x1,y1 ,x2,y2);
            if (a == true) {
                board[x1][y1] = 0;
                board[x2][y2] = 0;
            }
            printarr(board);
        }



    }

    private static void showBoard() {

        for (int[] b : board) {
            for (int c : b) {
                System.out.print(" " + c);
                System.out.println();
            }

        }
    }

    public static void init() {
        //计算循环的次数
        int count = SIZE * SIZE / 2;
        for (int i = 0; i < count; i++) {
            //计算2个点的编号(一维数组)
            int p1 = i * 2;
            int p2 = p1 + 1;
            int y1 = p1 / SIZE;
            int x1 = p1 % SIZE;
            int y2 = p2 / SIZE;
            int x2 = p2 % SIZE;
            int rInt = 1 + rd.nextInt(9);
            board[y1][x1] = rInt;
            board[y2][x2] = rInt;
        }
    }

    private static void printarr(int arr[][]) {
        for (j = 0; j < arr[0].length; j++) {
            System.out.print("\t" + j);
        }
        System.out.println();
        for (j = 0; j < arr[0].length; j++) {
            System.out.print("\t" + "*");
        }
        System.out.println();
        for (i = 0; i < arr.length; i++) {//循环行
            System.out.print(i + "*\t");
            for (j = 0; j < arr[i].length; j++) {//循环列
                if (arr[i][j] == 0) {
                    System.out.print("\0"+"\t");
                    continue;
                    //System.out.print("\0\0\0");
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void UpsetArr(int arr[][]) {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        int temp = 0;
        int a = arr.length;
        int b = arr[0].length;
        for (i = 0; i < arr.length * arr[0].length * 10; i++) {
            x1 = rd.nextInt(a);
            y1 = rd.nextInt(b);
            x2 = rd.nextInt(a);
            y2 = rd.nextInt(b);

            temp = arr[x1][y1];
            arr[x1][y1] = arr[x2][y2];
            arr[x2][y2] = temp;
        }
    }

    private static boolean check(int x1, int y1, int x2, int y2) {
        System.out.println(board[x1][y1]+"  " +board[x2][y2] );
        if (board[x1][y1] != board[x2][y2]) {
            return false;
        }
        if (y1 == y2) {
            if (x1 == x2 + 1 || x1 == x2 - 1) {
                return true;
            }

            for (i = x1; i == x1; i += (x1 < x2 ? 1 : -1)) {
                if (board[y1][i] != 0) {
                    return false;
                }
            }
            return true;
        }
        if (x1 == x2) {
            if (y1 == y2 + 1 || y1 == y2 - 1) {
                return true;
            }

            for (i = y1; i == y1; i += (y1 < y2 ? 1 : -1)) {
                if (board[i][x1] != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}