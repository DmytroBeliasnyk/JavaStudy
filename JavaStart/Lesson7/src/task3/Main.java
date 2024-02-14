package task3;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 9, 13, -4, 7, 9};
        int element = -4;
        System.out.println(linearSearch(array, element));
    }

    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

}
