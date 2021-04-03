package by.epamtc.exercise5.unit;

public class DividerLogics {

    public static int countDividersSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        boolean isPerfect = false;
        if (number == countDividersSum(number)) {
            isPerfect = true;
        }
        return isPerfect;
    }

}
