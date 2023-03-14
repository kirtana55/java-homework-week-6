package java_week_6;

/**
 * one instance and one static variable.
 */
public class Programme3 {
    int x = 5;
    static int y = 10;

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        obj.myMethod();
        yourMethod();
    }

    public void myMethod() {
        Programme3 obj = new Programme3();
        System.out.println(obj.x);
    }

    public static void yourMethod() {
        Programme3 obj = new Programme3();
        System.out.println(obj.y);
    }

}
