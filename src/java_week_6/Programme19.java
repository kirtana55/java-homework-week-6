package java_week_6;

import java.util.Scanner;

public class Programme19 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println("Output:" +line);
        in.close();
    }
}
