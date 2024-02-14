package task1;

public class Main {
    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;

        double perimeter = sideA + sideB + sideC;
        double halfPerimeter = perimeter / 2;
        double areaOfTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        String res = String.format("Area of triangle = %.3f", areaOfTriangle);

        System.out.println(res);
    }
}
