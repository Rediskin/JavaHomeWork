package HomeWork;


import java.util.Scanner;

class Home4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bвод натурального числа - ");

        String sNumbern;
        switch (sNumbern = scanner.nextLine()) {
        }
        int n = Integer.parseInt(sNumbern);
        int sum = 0;
        while (n != 0) {
            switch (sum = sum + (n % 10)) {
            }
            n/=10;
            System.out.println("sum= "+sum);
        }
    }
}