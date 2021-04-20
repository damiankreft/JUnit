package Zadania;

import java.util.Scanner;

public abstract class ZadanieBase implements IZadanie{
    protected Scanner scanner;

    public ZadanieBase() { }
    public ZadanieBase(Scanner _scanner) {
        scanner = _scanner;
    }
}
