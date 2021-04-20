package Zadania;

import java.util.Scanner;

public class Zadanie13 extends ZadanieBase{
    public Zadanie13(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 13.");
        try {
            System.out.println("Wpisz elementy tablicy oddzielone spacjami");
            var values = scanner.nextLine().split(" ");
            int[] tab = new int[values.length];
            for (var i = 0; i < tab.length; i++) {
                tab[i] = Integer.parseInt(values[i]);
            }
            System.out.println(findMax_recursive(tab, tab.length));
        }
        catch (Exception ex) {
            System.out.println("BŁĄD");
        }
    }

    private static int findMax_recursive(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        }

        if (tab[n - 1] > findMax_recursive(tab, n - 1)) {
            return tab[n - 1];
        }
        else {
            return findMax_recursive(tab, n - 1);
        }
    }
}
