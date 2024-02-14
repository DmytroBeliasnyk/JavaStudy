package task1;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{0, 5, 2, 4, 7, 1, 3, 19};
        System.out.println(findOddNumber(myArray));
    }

    public static int findOddNumber(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                res++;
            }
        }
        return res;
    }
}
