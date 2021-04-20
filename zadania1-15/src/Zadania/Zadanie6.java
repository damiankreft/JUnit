package Zadania;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie6 extends ZadanieBase{
    public Zadanie6(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 6.");
        try {
            var vals = scanner.nextLine().split(" ");
            var a = Integer.parseInt(vals[0]);
            var b = Integer.parseInt(vals[1]);
            var c = Integer.parseInt(vals[2]);

            var values = new ArrayList<Integer>() {{ add(a); add(b); add(c); }};

            for (var i = 0; i < values.size() - 1; i++) {
                for (var j = 0; j < values.size() - i - 1; j++) {
                    if ( values.get(j) > values.get(j + 1)) {
                        Collections.swap(values, j, j + 1);
                    }
                }
            }

            for (var val : values) {
                var df = new DecimalFormat("0.000000");
                System.out.print(df.format(val) + " ");
            }
            System.out.println();
            for (var i = values.size() - 1; i >= 0; i--) {
                var df = new DecimalFormat("0.000000");
                System.out.print(df.format(values.get(i)) + " ");
            }
        }
        catch (Exception ex) {
            System.out.println("BŁĄD");
        }
    }
}
