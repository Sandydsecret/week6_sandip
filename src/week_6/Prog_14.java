package week_6;

import java.util.Scanner;

public class Prog_14 {
    // Calculating area and perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(int height, int width) {
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("The area of the rectangle is : " + area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int width = scanner.nextInt();
        areaAndPerimeterOfRectangle(height, width);
        scanner.close();                     // closing the scanner object

    }


}