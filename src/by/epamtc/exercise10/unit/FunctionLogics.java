package by.epamtc.exercise10.unit;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionLogics {

    public static Map<Double, Double> calculateFunctionValues(double lowerBorder, double upperBorder, double step) {
        Map<Double, Double> result = new LinkedHashMap<>();

        BigDecimal lowerBorderExact = doubleToBigDecimal(lowerBorder);
        BigDecimal upperBorderExact = doubleToBigDecimal(upperBorder);
        BigDecimal stepExact = doubleToBigDecimal(step);

        while (lowerBorderExact.compareTo(upperBorderExact) <= 0) {
            BigDecimal resultValue = doubleToBigDecimal(Math.tan(lowerBorderExact.doubleValue()));
            result.put(lowerBorderExact.doubleValue(), resultValue.doubleValue());
            lowerBorderExact = lowerBorderExact.add(stepExact);
        }
        return result;
    }

    public static BigDecimal doubleToBigDecimal(double number) {
        MathContext mathContext = new MathContext(15);
        BigDecimal bigDecimal = new BigDecimal(number, mathContext);
        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
        return bigDecimal;
    }

    public static String resultToString(Map<Double, Double> result) {
        StringBuilder stringBuilder = new StringBuilder();
        result.forEach((k, v) -> stringBuilder.append(k).append(" ").append(v).append("\n"));
        return stringBuilder.toString();
    }

}
