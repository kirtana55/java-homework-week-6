package java_week_6;
/**
 * Takes three numbers as input to calculate and print the average of the numbers
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double a = s.nextDouble();
        System.out.print("Input the second number: ");
        double b = s.nextDouble();
        System.out.print("Input the third number: ");
        double c = s.nextDouble();
        System.out.print("The average value is " + average(a, b, c) + "\n");
        s.close();
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
