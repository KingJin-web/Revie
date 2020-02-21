package D0211;

public class a {

    int abs(int num) {
        return num > 0 ? num : -num;
    }
    float abs(float num) {
        return num > 0 ? num : -num;
    }
    double abs(double num) {
        return num > 0 ? num : -num;
    }
    long abs(long num) {
        return num > 0 ? num : -num;
    }
    short abs(short num) {
        return (short)(num > 0 ? num : -num);
    }
    byte abs(byte num) {
        return (byte) (num > 0 ? num : -num);
    }
    public static void main(String[] args) {
        a b = new a();
        System.out.println(b.abs(-12));
        System.out.println(b.abs(-1.1232));
        System.out.println(b.abs(-1.2f));
        System.out.println(b.abs(-1121159559595959335L));
        System.out.println(b.abs(-1));

    }
}
