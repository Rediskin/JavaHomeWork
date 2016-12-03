package HomeWork;

/**
 * Created by user on 29.11.2016.
 */

import java.util.Scanner;

public class Home6 {

    public static class Main {

        public static void main(String[] args) {

            Scanner scaner = new Scanner(System.in);
            double a = scaner.nextDouble();
            double b = scaner.nextDouble();

            if (a > 0 && b > 0) {
                double s = 0.5 * a * b;
                System.out.println("Площадь треугольника равна: " + s);
                double g = Math.sqrt(a * a + b * b);
                double p = a + b + g;
                System.out.println("Периметр треугольника равен: " + p);
            }


        }
    }

}
