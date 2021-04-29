package by.epamtc.exercise5.unit;

public class DividerLogics {

    public static int countDividersSum(int number) {
        int sum = 1;
        int rootOfNumber = (int) Math.sqrt(number);
        for (int i = 2; i < number; i++) {
            if (i > rootOfNumber && sum == 1) {
                break;
            }
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
