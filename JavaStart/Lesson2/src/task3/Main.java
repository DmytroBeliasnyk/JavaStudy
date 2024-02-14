package task3;

public class Main {
    public static void main(String[] args) {
        double petrolCost = 1.2;
        int distance = 100;
        int petrolForDistance = 8;
        int myRoad = 120;

        double petrolForOneKm = (double) petrolForDistance / distance;
        double petrolForMyRoad = petrolForOneKm * myRoad;
        double totalCost = petrolCost * petrolForMyRoad;

        System.out.println(totalCost + "$");
    }
}
