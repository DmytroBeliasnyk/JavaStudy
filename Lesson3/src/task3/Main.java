package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Input side a and press Enter.");
        a = sc.nextInt();
        System.out.println("Input side b and press Enter.");
        b = sc.nextInt();
        System.out.println("Input side c and press Enter.");
        c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && c + b > a) {
                System.out.println("Such a triangle exists.");
            } else {
                System.out.println("There is no such triangle.");
            }
        } else {
            System.out.println("There is no such triangle.");
        }
    }

}
