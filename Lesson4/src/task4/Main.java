package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a height of figure.");
        int h = sc.nextInt();

        int rows = 1;
        int stars = 0;

        for (; rows <= 2 * h - 1; ) {
            System.out.print("*");
            stars += 1;
            if (stars == h - Math.abs(h - rows)) {
                System.out.println();
                rows += 1;
                stars = 0;
            }
        }

    }
}
