package task4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("D:\\JavaStudy\\JavaStart\\Lesson8\\poem.txt");

        String myText = getTextFromFile(myFile);

        String newText = myText.toLowerCase();
        char[] symbolsFromText = newText.toCharArray();

        char[] alphabet = new char[26];
        getAlphabet(alphabet);

        int[] letters = new int[alphabet.length];
        calculateLetters(letters, symbolsFromText);
        sortMyArrays(letters, alphabet);
    }

    public static String getTextFromFile(File file) {
        String result = "";
        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                result += sc.nextLine() + System.lineSeparator();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static char[] getAlphabet(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('a' + i);
        }
        return letters;
    }

    public static int[] calculateLetters(int[] array, char[] symbols) {
        int res = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j] == (char) ('a' + i)) {
                    array[i] = res;
                    res++;
                }
            }
            res = 0;
        }
        return array;
    }

    public static int foundMax(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static int foundIndexOfMaxElement(int[] array) {
        int index = 0;
        for (; index < array.length; index++) {
            if (array[index] == foundMax(array)) {
                break;
            }
        }
        return index;
    }

    public static void sortMyArrays(int[] array, char[] symbols) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(symbols[foundIndexOfMaxElement(array)] + " = " + foundMax(array));
            array[foundIndexOfMaxElement(array)] = -1;
        }
    }
}
