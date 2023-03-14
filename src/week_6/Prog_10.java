package week_6;
/* Write java programme that takes number as input and prints its
multiplication table upto 10.
Test Data: Input a number: 8
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
....
8 x 10 = 80
 */

import java.util.Scanner;

public class Prog_10 {
    public static void main(String[] args) {
       Prog_10 trident = new Prog_10();
       trident.multiplicationTableOf();
    }


    public static void multiplicationTableOf() {//Printing the multiplication table of entered number
        Scanner scanner = new Scanner(System.in); //Scanner declaration for the reading input from the console
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();   // multiplication Table of(number);

        System.out.println(number + " x " + 1 + " = " + (number));
        System.out.println(number + " x " + 2 + " = " + (number * 2));
        System.out.println(number + " x " + 3 + " = " + (number * 3));
        System.out.println(number + " x " + 4 + " = " + (number * 4));
        System.out.println(number + " x " + 5 + " = " + (number * 5));
        System.out.println(number + " x " + 6 + " = " + (number * 6));
        System.out.println(number + " x " + 7 + " = " + (number * 7));
        System.out.println(number + " x " + 8 + " = " + (number * 8));
        System.out.println(number + " x " + 9 + " = " + (number * 9));
        System.out.println(number + " x " + 10 + " = " + (number * 10));
        scanner.close();     //closing the scanner object

    }
}

