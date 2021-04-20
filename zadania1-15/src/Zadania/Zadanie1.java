package Zadania;

import java.util.Scanner;

public class Zadanie1 extends ZadanieBase{
    public Zadanie1(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 1.");
        var arg1 = scanner.nextLine();
        var arg2 = scanner.nextLine();
        var val1 = Double.parseDouble(arg1);
        var val2 = Double.parseDouble(arg2);

        System.out.println(val1 * val2);
    }
}
