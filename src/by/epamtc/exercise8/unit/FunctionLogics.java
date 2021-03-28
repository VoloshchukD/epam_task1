package by.epamtc.exercise8.unit;

import static java.lang.Math.pow;

public class FunctionLogics {

    public static double countValueOnFirstPlot(double x) {
        return (-pow(x, 2) + 3 * x + 9);
    }

    public static double countValueOnSecondPlot(double x) {
        return (1 / (pow(x, 3) - 6));
    }

    public static double countFunctionValue(double x) {
        return x < 3 ? countValueOnSecondPlot(x) :
                countValueOnFirstPlot(x);
    }

}
