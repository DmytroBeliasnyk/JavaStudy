package task5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[900];
        createArray(myArray);
        System.out.println(Arrays.toString(myArray));
        int res = foundPalindroms(myArray);
        System.out.println(res);
    }

    public static int[] createArray(int[] array) {
        int element = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = element;
            element++;
        }
        return array;
    }

    public static boolean checkPalindrom(int number) {
        int a = number / 100000;
        number %= 100000;
        int b = number / 10000;
        number %= 10000;
        int c = number / 1000;
        number %= 1000;
        int d = number / 100;
        number %= 100;
        int e = number / 10;
        number %= 10;
        int f = number % 10;
        if (a == f && b == e && c == d) {
            return true;
        }
        return false;
    }

    public static int foundPalindroms(int[] array) {
        int number;
        int maxPalindrom = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                number = array[i] * array[j];
                if (number > 100000 && (checkPalindrom(number)) && number > maxPalindrom) {
                    maxPalindrom = number;
                }
            }
        }
        return maxPalindrom;
    }
}
