package week_6;

import java.util.Scanner;

/**
        * Write a program to insert any temperature value in degree Fahrenheit
        * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
        */

public class Prog_7 {
           public static void main(String[] args) {
               Scanner trident = new Scanner(System.in);
               System.out.println("Enter the temperature in Fahrenheit :  ");
               float f = trident.nextFloat(); // float = decimal value
               Prog_7 t = new Prog_7();
               t . converter(f);
               trident.close();    // closing the scanner object
           }
           public static void converter(float temperature) {
               float c = (( temperature  - 32) *5/9);
               System.out.println("The temperture"+ temperature + " Fahrenheit is eqaul to " + c + "degree celsius" );

           }
}
