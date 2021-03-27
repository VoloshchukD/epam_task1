package by.epamtc.exercise9.unit;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CircleLogics {

    public static double countСircumference(double r) {
        return 2 * PI * r;
    }

    public static double countSquare(double r) {
        return PI * pow(r, 2);
    }

}
