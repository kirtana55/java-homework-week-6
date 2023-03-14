package java_week_6;

/**
 * Two static variables and one static method.
 */
public class Programme2 {
    static int a = 30;
    static int b = 20;

    public static void main(String[] args) {
        Programme2 obj = new Programme2();
        Subtraction();
    }
    public static void Subtraction() {
        Programme2 obj = new Programme2();
        System.out.println(a - b);
    }
}