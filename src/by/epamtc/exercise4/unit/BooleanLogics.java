package by.epamtc.exercise4.unit;

public class BooleanLogics {

    public static int countEvenNumbers(int[] numbers) {
        int evenNumbersCounter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbersCounter++;
            }
        }
        return evenNumbersCounter;
    }

    public static boolean isEvenNumbers(int[] inputNumbers) {
        int evenNumbersAmount = countEvenNumbers(inputNumbers);
        boolean result = false;
        if (evenNumbersAmount >= 2) {
            result = true;
        }
        return result;
    }

}
