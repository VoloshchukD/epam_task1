package by.epamtc.exercise6.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise6.unit.TimeLogics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число секунд: ");
        int seconds = DataScanner.enterIntFromConsole();

        String result = TimeLogics.convertTime(seconds);
        System.out.println(result);
    }
}
