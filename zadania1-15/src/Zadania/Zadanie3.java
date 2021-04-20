package Zadania;

import java.util.Scanner;

public class Zadanie3 extends ZadanieBase{
    public Zadanie3(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 3.");
        var arg1 = scanner.nextLine();
        var values = arg1.split(" ");
        System.out.println("\"%" + values[1] + " " + values[0] + "%\"");
    }
}
