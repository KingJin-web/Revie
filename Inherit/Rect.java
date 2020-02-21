package Inherit;

public class Rect extends Shape {
    public double weight;
    public double height;

    public Rect(){

    }
    public Rect(double a, double b) {
        this.weight = a;
        this.height = b;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void getArea(){
        System.out.println("面积="+weight*height);
    }
}
