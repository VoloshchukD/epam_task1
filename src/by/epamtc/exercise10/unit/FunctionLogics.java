package by.epamtc.exercise10.unit;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionLogics {

    public static Map<Double, Double> calculateFunctionValues(double lowerBorder, double upperBorder,
                                                              double step) {
        Map<Double, Double> result = new LinkedHashMap<>();

        BigDecimal lowerBorderExact = BigDecimalLogics.doubleToBigDecimal(lowerBorder);
        BigDecimal upperBorderExact = BigDecimalLogics.doubleToBigDecimal(upperBorder);
        BigDecimal stepExact = BigDecimalLogics.doubleToBigDecimal(step);

        while (lowerBorderExact.compareTo(upperBorderExact) <= 0) {
            BigDecimal resultValue = BigDecimalLogics.doubleToBigDecimal(Math.tan(
                    lowerBorderExact.doubleValue()));
            result.put(lowerBorderExact.doubleValue(), resultValue.doubleValue());
            lowerBorderExact = lowerBorderExact.add(stepExact);
        }
        return result;
    }

    public static String resultToString(Map<Double, Double> result) {
        StringBuilder stringBuilder = new StringBuilder();
        result.forEach((k, v) -> stringBuilder.append(k).append(" ").append(v).append("\n"));
        return stringBuilder.toString();
    }

}
