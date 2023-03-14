package java_week_6;

import java.util.Scanner;

/**
 * A program for to calculate the area of a triangle
 */
public class Programme8 {
    // Area = (height of triangle * base of triangle)/2
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter height of Triangle");
        double h = s.nextDouble();
        System.out.println("Enter base of Triangle");
        double b = s.nextDouble();
        double area = (b * h) / 2;
        System.out.println("Area of Triangle is: " + area);
        s.close();
    }

}
