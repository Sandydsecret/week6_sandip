package week_6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Prog_8 {

    public static void main(String[] args) {

        Scanner trident = new Scanner(System.in);
        int length = trident.nextInt();
        System.out.println("Enter length of the triangle :   ");
        int height = trident.nextInt();
        System.out.println("Enter height of the triangle :   ");
        areaoftriangle(length,height);


    }

    public static void areaoftriangle(int length , int height ) {
        int area = (length * height) /2;
        System.out.println("Area of triangle :" + area);


    }
}
