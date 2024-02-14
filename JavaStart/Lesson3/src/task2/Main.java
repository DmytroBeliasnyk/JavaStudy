package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input flat number and press Enter.");
        int flatNum = sc.nextInt();

        if (0 < flatNum && flatNum <= 180) {
            int entrance = (flatNum - 1) / (9 * 4) + 1;
            int floor = ((flatNum - 1) / 4) % 9 + 1;
            System.out.println("Number of entrance " + entrance);
            System.out.println("Number of floor  " + floor);
        } else {
            System.out.println("There is no such apartment number in this house.");
        }
    }
}
