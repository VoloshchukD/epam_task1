package by.epamtc.exercise1.unit;

public class CalculationLogics {

    public static int calculateLastSquaredDigit(int number) {
        int lastDigitOfNumber = number % 10;
        int squaredNumber = (int) Math.pow(lastDigitOfNumber, 2);
        return squaredNumber % 10;
    }

}
