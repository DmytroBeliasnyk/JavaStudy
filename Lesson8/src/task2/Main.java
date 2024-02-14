package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[][] myArray = new int[4][4];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = rnd.nextInt(0, 10);
            }
        }
        saveArrayOnFile(Arrays.deepToString(myArray));
    }

    public static void saveArrayOnFile(String array) {
        File file1 = new File("array.txt");
        try (PrintWriter pw = new PrintWriter(file1);) {
            pw.println(array);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
