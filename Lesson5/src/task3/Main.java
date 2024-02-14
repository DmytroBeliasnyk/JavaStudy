package task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOf(arr, 30);
        for (int i = 15, j = 0; i < arr2.length && j < arr.length; i++, j++) {
            arr2[i] = arr[j] * 2;
        }
        System.out.println(Arrays.toString(arr2));
    }

}
