import java.util.Random;

public class Main {
    private String name=null;// 名字
    private int health=0;// 健康值
    private String sex=null;// 性别
    public void Penguin() {
        health = 10;
        sex = "雄";
        System.out.println("执行构造方法。");
    }
    public void print() {
        System.out.println("企鹅的名字是" + name + "，健康值是" + health + "，性别是" + sex+ "。");
    }
    public static void main(String[] args) {
        Main pgn = new Main();
        pgn.print();
    }
}