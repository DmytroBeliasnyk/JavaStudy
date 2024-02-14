package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a length of figure and press Enter.");
        int lenght = sc.nextInt();
        System.out.println("Input a width of figure and press Enter.");
        int width = sc.nextInt();

        drawFigure(lenght, width);
    }

    public static void drawFigure(int lenght, int width) {
        for (int i = 1; i <= lenght; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
