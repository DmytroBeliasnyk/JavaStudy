package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a length of array and press Enter.");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input the next element of the array and press Enter.");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

}
