package Zadania;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadanie12 extends ZadanieBase{
    public Zadanie12(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 12.");
        var earthRevolveTime = 31557600;
        var age = Integer.parseInt(scanner.nextLine());
        var planet = scanner.nextLine();
        var time = 0.0d;
        time = age / earthRevolveTime;
        switch (planet) {
            case "Merkury":
                time *= 0.2408647;
                break;
            case "Wenus":
                time = 0.61519726;
                break;
            case "Mars":
                time = 1.8808158;
                break;
            case "Jowisz":
                time = 11.862615;
                break;
            case "Saturn":
                time = 29.447498;
                break;
            case "Uran":
                time = 84.016846;
                break;
            case "Neptun":
                time = 164.79132;
                break;
        }

        var df = new DecimalFormat("0.00");
        System.out.println(df.format(time));
    }
}
