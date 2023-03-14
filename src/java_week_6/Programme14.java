package java_week_6;
/**
 * A Java program to print the area and perimeter of a rectangle.
 */

import java.util.Scanner;
public class Programme14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = s.nextDouble();
        System.out.println("Enter the height");
        double height = s.nextDouble();

        double area = (width * height);
        System.out.println("Area of the Rectangle is " + width + " * " + height + " = " + (area));

        double perimeter = 2 * (width + height);
        System.out.println("Perimeter of the rectangle is 2* (" + width + " + " + height + ") = " + (perimeter));

        s.close();


    }
}
