package task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a string.");
        String text = sc.nextLine();
        String newText = text.toLowerCase();

        char[] symbols = newText.toCharArray();
        int res = 0;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 'b') {
                res++;
            }
        }
        System.out.println(res);
    }

}
