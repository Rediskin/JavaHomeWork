package HomeWork;

import java.util.Scanner;


public class Home7{

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d=(b*b)-(4*a*c);
            double e;
            double f;
            if(d==0){
                e=-1*(b/(2*a));
                System.out.println("Уравнеие имеет 1 квадратный корень, который равен "+e);
            }
            else {
                if(d>0){
                    e=((-1*b)+(double) Math.sqrt(d))/(2*a);
                    f=((-1*b)-(double) Math.sqrt(d))/(2*a);
                    System.out.println("Уравнение имеет 2 квадратных корня: "+e+" и " +f);
                }
                else {
                    System.out.println("Уравнение не имеет квадратных корней");
                }
            }
        }
}
