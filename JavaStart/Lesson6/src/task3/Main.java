package task3;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            String res = String.format("%." + i + "f", Math.PI);
            System.out.println(res);
        }
    }

}
