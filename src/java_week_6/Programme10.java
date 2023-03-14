package java_week_6;
/**
 *  A number as input amd prints its multiplication table.
 */
public class Programme10 {
    public static void main(String[] args) {

        int num = 8;
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d x %d = %d \n", num, i, num * i);
        }
    }

}
