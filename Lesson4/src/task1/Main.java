package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your number.");
        int n = sc.nextInt();

        for (int i = n - 1; i >= 1; i--) {
            n = n * i;
        }
        System.out.println(n);
    }

}
