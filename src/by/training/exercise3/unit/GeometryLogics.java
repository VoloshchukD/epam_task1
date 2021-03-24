package by.training.exercise3.unit;

public class GeometryLogics {

    public static int countCircleInSquareRadiusBySquareArea(int area) {
        return (int) Math.sqrt(area) / 2;
    }

    public static int countSquareInCircleAreaByCircleRadius(int radius) {
        return (int) (2 * Math.pow(radius, 2));
    }

    public static int countSquareDifference(int square1, int square2) {
        return square1 / square2;
    }

}
