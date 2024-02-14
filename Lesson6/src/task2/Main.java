package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a string of words and press Enter.");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        String res = "";
        for (String word : words) {
            if (word.length() > res.length()) {
                res = word;
            }
        }
        System.out.println("The longest word is: " + res + ".");
    }

}
