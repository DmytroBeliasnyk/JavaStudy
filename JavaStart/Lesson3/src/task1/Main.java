package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int maxNumber;

        System.out.println("Input a first number and press Enter.");
        a = sc.nextInt();
        System.out.println("Input a second number and press Enter.");
        b = sc.nextInt();
        System.out.println("Input a third number and press Enter.");
        c = sc.nextInt();
        System.out.println("Input a fourth number and press Enter.");
        d = sc.nextInt();

        maxNumber = a;

        if (b > maxNumber) {
            maxNumber = b;
        }
        if (c > maxNumber) {
            maxNumber = c;
        }
        if (d > maxNumber) {
            maxNumber = d;
        }
        if (a == b && a == c && a == d) {
            System.out.println("All numbers are equal.");
        }
        System.out.println("Max number is " + maxNumber);
    }
}
