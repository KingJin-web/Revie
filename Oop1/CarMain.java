package Oop1;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
       Car c = new Car();
       c.setOil_quantity(40);
       c.drive(100);
       c.addGas(10);
       System.out.println(c.getOil_quantity());
    }
}

