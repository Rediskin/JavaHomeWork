package HomeWork;

import java.util.Scanner;


/**
 * Created by user on 29.11.2016.
 */
public class Home5


{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        double m = scanner.nextDouble();
        closeToTen(m, n);
    }


    private static void closeToTen(double m, double n) {
        if (abs(10 - n) > abs(10 - m)) {
            System.out.println(m);
        } else if (abs(10 - m) > abs(10 - n)) {
            System.out.println(n);
        } else {
            System.out.println(n);
        }

    }

    public static double abs(double n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
}
