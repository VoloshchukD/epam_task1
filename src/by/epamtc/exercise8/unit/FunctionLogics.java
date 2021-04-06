package by.epamtc.exercise8.unit;

import by.epamtc.exercise10.unit.BigDecimalLogics;

public class FunctionLogics {

    public static double countFirstPlotValue(double argument) {
        BigDecimalLogics.doubleToBigDecimal(argument);
        return (-Math.pow(argument, 2) + 3 * argument + 9);
    }

    public static double countSecondPlotValue(double argument) {
        return (1 / (Math.pow(argument, 3) - 6));
    }

    public static double countFunctionValue(double argument) {
        return argument < 3 ? countSecondPlotValue(argument) :
                countFirstPlotValue(argument);
    }

}
