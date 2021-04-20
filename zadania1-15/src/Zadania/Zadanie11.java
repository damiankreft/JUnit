package Zadania;

import java.util.HashMap;
import java.util.Scanner;

public class Zadanie11 extends ZadanieBase{
    public Zadanie11(Scanner _scanner) {
        super(_scanner);
    }

    @Override
    public void execute() {
        System.out.println("Zadanie 11.");
        var characters = new HashMap<Character, Integer>();
        for (var i = 97; i < 123; i++) {
            characters.put((char)i, 0);
        }

        var input = scanner.nextLine().toCharArray();
        for (var c : input) {
            if (characters.containsKey(c)) {
                characters.put(c, characters.get(c) + 1);
            }
        }

        System.out.println(!characters.containsValue(0));
    }
}
