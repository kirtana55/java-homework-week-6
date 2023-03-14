package java_week_6;

/**
 * A program with addition,subtraction, multiplication and division methods
 */
public class Programme5 {
    public static void main(String[] args) {
        addition(15, 10);
        Subtraction(15, 10);
        Programme5 obj = new Programme5();
        obj.multiplications(15, 10);
        obj.division(15, 10);
    }

    public static void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two number is : " + ans);
    }

    public static void Subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction of two number is : " + ans);
    }

    void multiplications(int a, int b) {
        int ans = a * b;
        System.out.println("Multiplications of two number is : " + ans);
    }

    public void division(int a, int b) {
        int ans = a / b;
        System.out.println("Division of two number is : " + ans);
    }
}