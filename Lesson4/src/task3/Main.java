package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a leigth of square and press Enter.");
        int l = sc.nextInt();
        System.out.println("Input a height of square and press Enter.");
        int h = sc.nextInt();

        for (int i = 1; i < h; i++) {
            if (i == 1 || i == h - 1) {
                for (int j = 1; j <= l; j++) {
                    System.out.print("*");
                }
                if (i == h - 1) {
                    break;
                }
                System.out.println();
            }
            if (i < h - 1) {
                for (int k = 1; k <= l; k++) {
                    if (k == 1 || k == l) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
