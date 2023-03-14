package java_week_6;

import java.util.Scanner;

/**
 * A program to convert the upper case to lower case
 */
public class Programme9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a String :");
        String line = s.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        s.close();
    }
}
