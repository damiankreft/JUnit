/*
Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl.
W zadaniu użyj typu wyliczeniowego. Napisz program testujący,
który stworzy trzy różne obiekty klasy Card.

Damian Kreft
*/

package Lab2.Zadanie1;

import Lab2.Zadanie1.Enums.Suit;
import Lab2.Zadanie1.Enums.Value;

public class Card {
    private Value value;
    private Suit suit;

    Card(Value _value, Suit _color) {
        setValue(_value);
        setSuit(_color);
    }

    public Value getValue() {
        return value;
    }

    private void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    private void setSuit(Suit suit) {
        this.suit = suit;
    }
}
