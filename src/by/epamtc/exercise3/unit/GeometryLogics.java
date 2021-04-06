package by.epamtc.exercise3.unit;

public class GeometryLogics {

    public static double countCircleInSquareRadius(double area) {
        return Math.sqrt(area) / 2;
    }

    public static double countSquareInCircleArea(double radius) {
        return 2 * Math.pow(radius, 2);
    }

    public static double countSquareDifference(double square1, double square2) {
        return square1 / square2;
    }

}
