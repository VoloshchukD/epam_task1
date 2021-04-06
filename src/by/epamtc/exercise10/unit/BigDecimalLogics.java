package by.epamtc.exercise10.unit;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalLogics {

    public static int PRECISION = 15;

    public static int SCALE = 3;

    public static BigDecimal doubleToBigDecimal(double number) {
        MathContext mathContext = new MathContext(PRECISION);
        BigDecimal bigDecimal = new BigDecimal(number, mathContext);
        bigDecimal = bigDecimal.setScale(SCALE, BigDecimal.ROUND_DOWN);
        return bigDecimal;
    }

}
