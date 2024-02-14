package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[]{0, 2, 4, 6, 8, 10, 12};
        int[] array2 = new int[]{1, 4, 7, 10, 13};
        int[] array3 = new int[]{1, 2, 4, 8, 16, 32};
        int[] array4 = new int[]{1, 3, 9, 27};
        int[] array5 = new int[]{1, 3, 6, 27, 7};
        showResult(array1);
        showResult(array2);
        showResult(array3);
        showResult(array4);
        showResult(array5);
    }

    public static boolean checkArithmeticProgression(int[] array) {
        int step = array[1] - array[0];
        for (int i = array.length - 1; i >= 1; i--) {
            if (!(array[i] - array[i - 1] == step)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkGeometricProgression(int[] array) {
        int step = array[2] / array[1];
        for (int i = array.length - 1; i >= 1; i--) {
            if (!(array[i] / array[i - 1] == step)) {
                return false;
            }

        }
        return true;
    }

    public static String foundNextElement(int[] array) {
        int res = 0;
        if (checkArithmeticProgression(array)) {
            int step = array[1] - array[0];
            res = array[array.length - 1] + step;
            System.out.println("Is a arithmetic progression with step by " + step + ".");
            return "The next element of this sequence is " + res + ".";
        }
        if (checkGeometricProgression(array)) {
            int step = array[2] / array[1];
            res = array[array.length - 1] * step;
            System.out.println("Is a geometric progression with step by " + step + ".");
            return "The next element of this sequence is " + res + ".";
        }
        return "Is not a arithmetic or geometric progression.";
    }

    public static void showResult(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println(foundNextElement(array));
        System.out.println();
    }

}
