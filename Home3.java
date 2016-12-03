package HomeWork;

import java.util.Scanner;

/**
 * Created by user on 29.11.2016.
 */
public class Home3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean s = n%2==0;
        if(s)
            System.out.println("n - чётное");
        else
            System.out.println("n - нечётное");
    }
}
