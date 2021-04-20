/*
###############################################################################
#                               Damian Kreft                                  #
###############################################################################
#                           Zadanie 1 (1 punkt)                               #
###############################################################################
Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl.
W zadaniu użyj typu wyliczeniowego. Napisz program testujący,
który stworzy trzy różne obiekty klasy Card.
###############################################################################
*/


package Lab2.Zadanie1;

import Lab2.Zadanie1.Enums.Suit;
import Lab2.Zadanie1.Enums.Value;
import org.junit.Assert;
import org.junit.Test;

public class CardTest {
    @Test
    public void sets_cards_value_passed_to_the_constructor_as_value_fields_value() {
        // Arrange & Act
        var card = new Card(Value.Ten, Suit.Diamonds);

        // Assert
        Assert.assertEquals(Value.Ten, card.getValue());
    }

    @Test
    public void assigns_cards_suit_passed_to_the_constructor_to_suit_field() {
        // Arrange
        var value = Value.Ace;
        var suit = Suit.Spades;

        // Act
        var card = new Card(value, suit);

        // Assert
        Assert.assertEquals(suit, card.getSuit());
    }

    @Test
    public void assigns_suit_and_value_passed_to_the_constructor_to_related_fields() {
        // Arrange
        var value = Value.Two;
        var suit = Suit.Hearts;

        // Act
        var card = new Card(value, suit);

        // Assert
        Assert.assertEquals(value, card.getValue());
        Assert.assertEquals(suit, card.getSuit());
    }
}
