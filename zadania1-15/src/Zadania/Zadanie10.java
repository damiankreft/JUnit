package Zadania;

import java.util.Scanner;

public class Zadanie10 extends ZadanieBase{
    public Zadanie10(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 10.");
        var initial = scanner.nextLine().split(" ");
        var a = Integer.parseInt(initial[0]);
        var b = Integer.parseInt(initial[1]);
        var tab = new int[a][b];

        for (var row = 0; row < a; row++) {
            var input = scanner.nextLine().split(" ");
            for (var col = 0; col < b; col++) {
                tab[row][col] = Integer.parseInt(input[col]);
            }
        }

        transpose(tab, b);
    }

    private void transpose(int[][] tab, int b) {
        for (var col = 0; col < b; col++) {
            for (var row = 0; row < tab.length; row++) {
                System.out.print(tab[row][col] + " ");
            }
            System.out.println();
        }
    }
}
