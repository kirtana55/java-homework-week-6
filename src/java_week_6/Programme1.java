package java_week_6;

/**
 * Two instance variables and one instance method.
 */
public class Programme1 {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        obj.Addition();
    }

    public void Addition() {
        Programme1 obj = new Programme1();
        System.out.println(a + b);
    }
}