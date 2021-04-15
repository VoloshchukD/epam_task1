package by.epamtc.exercise9.unit;

import by.epamtc.exercise3.exception.InvalidRadiusValueException;

public class CircleLogics {

    public static double countСircumference(double radius) throws InvalidRadiusValueException {
        if (radius <= 0) throw new InvalidRadiusValueException("Radius value is wrong");
        return 2 * Math.PI * radius;
    }

    public static double countSquare(double radius) throws InvalidRadiusValueException {
        if (radius <= 0) throw new InvalidRadiusValueException("Radius value is wrong");
        return Math.PI * Math.pow(radius, 2);
    }

}
