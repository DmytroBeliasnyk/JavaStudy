package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("text.txt");

        String text = "";
        try (PrintWriter pw = new PrintWriter(file1);) {
            pw.println(inputTextOnFile(text));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(file1);
    }

    public static String inputTextOnFile(String myText) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your text and press Enter");
        myText = sc.nextLine();

        return myText;
    }
}
