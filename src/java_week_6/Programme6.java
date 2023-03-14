package java_week_6;
/**
 *Enter the radius of the circle and find the Area of the circle
 */

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {

        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("Area of the circle is " + area);
        input.close();

    }
}
