package Zadania;

import java.util.Scanner;

public class Zadanie8 extends ZadanieBase{
    public Zadanie8(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 8.");
        var error = "BŁĄD";
        var sign = "*";
        var blank = " ";
        try {
            var input = Integer.parseInt(scanner.nextLine());

            for (var i = 0; i < input; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(sign);
                }
                System.out.println();
            }
            for (var i = input; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(sign);
                }
                System.out.println();
            }
            for (var i = 0; i < input; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(blank);
                }
                for (int j = input; j > i; j--) {
                    System.out.print(sign);
                }
                System.out.println();
            }
            for (var i = input; i > 0; i--) {
                for (int j = 0; j < i - 1; j++) {
                    System.out.print(blank);
                }
                for (int j = input; j >= i; j--) {
                    System.out.print(sign);
                }
                System.out.println();
            }
        }
        catch (Exception ex) {
            System.out.println(error);
        }
    }
}
