package task1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rnd.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(myArray));

        int res = findMaxNumber(myArray);
        System.out.println("Max number is: " + res);
    }

    public static int findMaxNumber(int[] array) {
        int maxNumber;
        maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}

