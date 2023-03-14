package java_week_6;

public class Programme15
{
    public static void main(String[] args) {
        int a, b;
        a = 12;
        b = 18;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}
