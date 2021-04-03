package by.epamtc.exercise8.unit;

public class FunctionLogics {

    public static double countValueOnFirstPlot(double x) {
        return (-Math.pow(x, 2) + 3 * x + 9);
    }

    public static double countValueOnSecondPlot(double x) {
        return (1 / (Math.pow(x, 3) - 6));
    }

    public static double countFunctionValue(double x) {
        return x < 3 ? countValueOnSecondPlot(x) :
                countValueOnFirstPlot(x);
    }

}
