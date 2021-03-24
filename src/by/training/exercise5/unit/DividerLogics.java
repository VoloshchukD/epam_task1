package by.training.exercise5.unit;

public class DividerLogics {

    private static int findAllDividersSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean checkPerfectNumber(int number) {
        boolean isPerfect = false;
        if (number == findAllDividersSum(number)) {
            isPerfect = true;
        }
        return isPerfect;
    }

}
