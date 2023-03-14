package java_week_6;

/**
 * Two instance and two static variables
 */
public class Programme4 {

    int x = 5;
    int y = 10;
    static int a = 4;
    static int b = 2;

    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        obj.myMethod();
        yourMethod();
    }
    public void myMethod() {
        System.out.println(x + y);
    }

    public static void yourMethod() {
        System.out.println(a + b);
    }

}