package java_week_6;
/**
 *Write a Java program to convert a decimal number to binary number.
 */
import java.util.Scanner;

public class Programme17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is : " + binary);
        sc.close();
    }
}
