package by.epamtc.exercise7.unit;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class GeometryLogics {

    public static int countHypotenuse(int leg1, int leg2) {
        return (int) sqrt(pow(leg1, 2) + pow(leg2, 2));
    }

    public static int comparePointsСoordinates(Point point1, Point point2) {
        int hypotenuse1 = countHypotenuse(point1.getX(), point1.getY());
        int hypotenuse2 = countHypotenuse(point2.getX(), point2.getY());
        return hypotenuse1 - hypotenuse2;
    }

    public static String makeResultString(int compareResult) {
        return compareResult == 0 ?
                "точки на равном расстоянии" :
                compareResult > 0 ? "2я" : "1я";

    }

}
