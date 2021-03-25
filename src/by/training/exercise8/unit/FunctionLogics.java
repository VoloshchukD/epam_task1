package by.training.exercise8.unit;

import static java.lang.Math.pow;

public class FunctionLogics {

    private static double countValueOnFirstPlot(double x) {
        return (-pow(x, 2) + 3 * x + 9);
    }

    private static double countValueOnSecondPlot(double x) {
        return (1 / (pow(x, 3) - 6));
    }

    public static double countFunctionValue(double x) {
        return x < 3 ? countValueOnSecondPlot(x) :
                countValueOnFirstPlot(x);
    }

}
