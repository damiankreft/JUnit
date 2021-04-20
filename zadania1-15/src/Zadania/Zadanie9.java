package Zadania;

import java.util.Scanner;

public class Zadanie9 extends ZadanieBase{
    public Zadanie9(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 9.");
        var input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("TAK");
        }
        else {
            System.out.println("NIE");
        }
    }

    private boolean isPalindrome(String text) {
        var length = text.length();
        for (var i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
