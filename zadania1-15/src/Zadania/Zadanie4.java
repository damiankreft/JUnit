package Zadania;

import java.util.Scanner;

public class Zadanie4 extends ZadanieBase{
    public Zadanie4(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 4.");
        try {
            var vals = scanner.nextLine().split(" ");
            var a = Integer.parseInt(vals[0]);
            var b = Integer.parseInt(vals[1]);
            var c = Integer.parseInt(vals[2]);

            if (a < 0 || b < 0 || c < 0){
                throw new ArithmeticException();
            }

            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("TAK");
            }
            else {
                System.out.println("NIE");
            }
        } catch (Exception ex) {
            System.out.println("BŁĄD");
        }
    }
}
