package by.epamtc.exercise10.unit;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionLogics {

    public static Map<Double, Double> calculateFunctionValues(double lowerBorder, double upperBorder, double step) {
        Map<Double, Double> result = new LinkedHashMap<>();

        BigDecimal lowerBorderExact = new BigDecimal(lowerBorder);
        BigDecimal upperBorderExact = new BigDecimal(upperBorder);
        BigDecimal stepExact = new BigDecimal(step);

        while (lowerBorderExact.compareTo(upperBorderExact) <= 0) {
            result.put(lowerBorderExact.doubleValue(), Math.tan(lowerBorderExact.doubleValue()));
            lowerBorderExact = lowerBorderExact.add(stepExact);
        }
        return result;
    }

}
