package D0215;




public class SpringParty {
    private Program[] programs = new Program[100];
    private int index = 0; //节目编号

    public void addProgram(Program p){
        programs[index] = p;
        index ++;
    }

    public void start() {
        for (Program p :programs){

        }
    }

    public static void main(String[] args) {
        SpringParty springParty = new SpringParty();
        springParty.addProgram(new Sing("只因你太美"));
        springParty.addProgram(new Dance("鸡你太美"));
        springParty.addProgram(new Magic("头顶篮球"));
        springParty.start();

    }
}

class Program {
    String name;

    public void show() {
        System.out.println(name + " :");
    }
}

class Sing extends Program {
    Sing(String name){
        this.name = name;
    }
    public void show() {
        super.show();
        System.out.println("唱歌");
    }
}

class Dance extends Program {
    Dance(String name){
        this.name = name;
    }
    public void show() {
        super.show();
        System.out.println("跳舞");
    }
}

class Magic extends Program {
    Magic(String name){
        this.name = name;
    }
    public void show() {
        super.show();
        System.out.println("唱歌");
    }
}