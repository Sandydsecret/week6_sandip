package week_6;

import java.util.Scanner;

public class Prog_5 {


    /**
     * Write a program for a calculator with addition, subtraction, multiplication and division
     * methods all with parameters and use string concatenation methods.
     * (Note: Two static and Two instance methods.)
     */




        public static void addition(int a, int b) {        //static methods named as addition with parameter
            int result = a + b;
            System.out.println("The Addition of " + a + " and " + b + " is : " + result);
        }

        public static int subtraction(int a, int b) {     // //static methods named as subtraction with parameter

            return a - b;
        }


        public void multiplication(int a, int b) {      //instance methods named as multiplication with parameter
            int result = a * b;
            System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
        }
        public int division(int a, int b) {          //instance methods named as division with parameter

            return a / b;
        }
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);     //Scanner declaration for reading input form console
            System.out.println("Please enter first number : ");
            int a = scanner.nextInt();
            System.out.println("Please enter second number : ");
            int b = scanner.nextInt();
            addition(a, b);
            int minus = subtraction(a, b);
            System.out.println("The subtraction of " + a + " and " + b + " is : " + minus);
            Prog_5 obj = new Prog_5();
            obj.multiplication(a, b);
            int divide = obj.division(a, b);
            System.out.println("The division of " + a + " and " + b + " is : " + divide);
            System.out.println("Thank you ");


            scanner.close();       // closing the scanner object
        }


    }






