/*
Zaimplementuj klasę Invoice reprezentującą fakturę dla sklepu.
Klasa przechowuje następujące informacje: product_number (typ String),
prodcut_description (typ String), quantity(typ int) i pricePerItem`(typ double).
Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów.
Zaimplementuj metody set i get dla każdej zmiennej.
Dodaj metodę:
Amount, które zwraca iloczyn quantity i pricePerItem.
Jeżeli pricePerItem nie jest dodatnia, Amount powinien zwrócić 0. Jeżeli quantity nie jest dodatnie,
Amount powinna zwrócić 0. Przetestuj zaimplementowany program.

Damian Kreft
*/


package Lab2.Zadanie6;

import java.util.Objects;

public class Invoice {
    final String UNKNOWN = "unknown";

    public Invoice(String product_number, int quantity, double pricePerItem, String product_description) {
        setProduct_number(product_number);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
        setProduct_description(product_description);
    }

    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = Objects.requireNonNullElse(product_number, UNKNOWN);
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = Objects.requireNonNullElse(product_description, "");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double Amount() {
        return getQuantity() >= 0 && getPricePerItem() >= 0 ? getQuantity() * getPricePerItem() : 0.0;
    }
}
