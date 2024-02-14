package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number.");
        int a = sc.nextInt();
        multiplication(a);
    }

    public static void multiplication(int n) {
        int res;
        for (int i = 1; i <= 10; i++) {
            res = n * i;
            System.out.println(n + "*" + i + "=" + res);
        }
    }
}
