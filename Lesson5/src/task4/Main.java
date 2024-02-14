package task4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(myArray));
        reverseArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void reverseArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex = (startIndex + endIndex) / 2;
        int n;
        for (int i = 0; i < middleIndex; i++) {
            n = array[i];
            array[i] = array[endIndex + startIndex - i];
            array[endIndex + startIndex - i] = n;
        }
    }

}
