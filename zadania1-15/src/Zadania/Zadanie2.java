package Zadania;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadanie2 extends ZadanieBase{
    public Zadanie2(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 2.");
        var val = Math.sqrt(Math.PI);
        var df = new DecimalFormat("###.##");
        System.out.println(df.format(val));
    }
}
