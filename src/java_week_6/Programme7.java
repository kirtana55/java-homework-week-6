package java_week_6;

/**
 *Enter any temperature value in degree Fahrenheit and get result in degree Celsius.
 */

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double f = s.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(f + "degree Fahrenheit = " + c + " degree Celsius ");
        System.out.println("Enter height of Triangle");

        s.close();
    }


}