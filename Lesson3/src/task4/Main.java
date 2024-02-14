package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the your ticket number and press Enter.");
        int num = sc.nextInt();

        int n1;
        int n2;
        int n3;
        int n4;

        if (1000 < num && num < 9999) {
            n1 = num / 1000;
            num = num % 1000;

            n2 = num / 100;
            num = num % 100;

            n3 = num / 10;
            n4 = num % 10;

            if (n1 + n2 == n3 + n4) {
                System.out.println("Number of your ticket is lucky.");
            } else {
                System.out.println("Number of your ticket is not lucky.");
            }
        } else {
            System.out.println(false);
        }
    }
}
