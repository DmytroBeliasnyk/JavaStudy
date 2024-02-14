package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a six-digit natural number and press Enter.");
        int number = sc.nextInt();

        if (100000 <= number && number <= 999999) {
            int a = number / 100000;
            number = number % 100000;

            int b = number / 10000;
            number = number % 10000;

            int c = number / 1000;
            number = number % 1000;

            int d = number / 100;
            number = number % 100;

            int e = number / 10;
            int f = number % 10;

            if (a == f && b == e && c == d) {
                System.out.println("It is a palindrom.");
            } else {
                System.out.println("Is not a palindrom.");
            }
        } else {
            System.out.println("Is not a six-digit natural number.");
        }
    }
}
