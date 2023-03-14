package week_6;

import java.util.Scanner;

public class Prog_6 {
    /**
     *  * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
     */

    public static void main(String[] args) {
        Scanner trident = new Scanner(System.in); // scanner declaration for reading input from concsole
        System.out.println("Enter the any radius value : ");
        double radius = trident.nextDouble();  // double for more than two number
        areaofcicle(radius);
        trident.close();   // closing scanner object(trident)
    }

    public static void areaofcicle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius* radius);
        System.out.println("Area of the circle is : "+ area);
        System.out.println("Hope you got.");

    }

}
