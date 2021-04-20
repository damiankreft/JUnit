package Zadania;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie7 extends ZadanieBase{
    public Zadanie7(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 7.");
        var valueDelimiter = " ";
        var n = 0;
        var m = 0;

        var listN = new ArrayList<Integer>();
        var listM = new ArrayList<Integer>();
        try {
            var initial = scanner.nextLine().split(valueDelimiter);
            n = Integer.parseInt(initial[0]);
            m = Integer.parseInt(initial[1]);

            if (n < 0 || m < 0) {
                System.out.println("BŁĄD");
            }

            var inputN = scanner.nextLine();
            var valuesN = inputN.split(valueDelimiter);
            var inputM = scanner.nextLine();
            var valuesM = inputM.split(valueDelimiter);
            populateCollections(valuesN, valuesM, listN, listM, n, m);
            var scalarProduct = calculateScalarProduct(listN, listM, n);
            System.out.println(scalarProduct);
        }
        catch (Exception ex) {
            System.out.println("BŁĄD");
        }
    }

    private void populateCollections(String[] valuesN, String[] valuesM, ArrayList<Integer> listN, ArrayList<Integer> listM, int n, int m) {
        for (var i = 0; i < n; i++) {
            listN.add(Integer.parseInt(valuesN[i]));
        }

        for (var i = 0; i < m; i++) {
            listM.add(Integer.parseInt(valuesM[i]));
        }
    }

    private int calculateScalarProduct(ArrayList<Integer> listN, ArrayList<Integer> listM, int n) {
        var scalarProduct = 0;
        for (var i = 0; i < n; i++) {
            scalarProduct += listN.get(i) * listM.get(i);
        }

        return scalarProduct;
    }
}
