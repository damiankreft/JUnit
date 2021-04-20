package Lab2.Zadanie6;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvoiceTest {
    public static final double delta = 0.000001;

    @Test
    public void returns_calculated_amount() {
        var invoice = new Invoice("E0205B17", 10, 2.5, "Chocolate Bar");
        var expected = 2.5 * 10;

        var amount = invoice.Amount();

        assertEquals(expected, amount, delta);
    }

    @Test
    public void given_negative_quantity_returns_zero() {
        var invoice = new Invoice("E0205B17", -1, 2.5, "Chocolate Bar");
        var expected = 0;

        var amount = invoice.Amount();

        assertEquals(expected, amount, delta);
    }

    @Test
    public void given_negative_PricePerItem_returns_zero() {
        var invoice = new Invoice("E0205B17", 10, -5.0, "Chocolate Bar");
        var expected = 0;

        var amount = invoice.Amount();

        assertEquals(expected, amount, delta);
    }

    @Test
    public void given_null_description_sets_description_to_empty_string() {
        var invoice = new Invoice("E0205B17", 10, 2.5, null);

        var description = invoice.getProduct_description();

        assertEquals("", description);
    }

    @Test
    public void given_null_product_name_sets_ProductNumber_to_unknown() {
        var invoice = new Invoice(null, 10, 2.5, "");

        var product_number = invoice.getProduct_number();

        assertEquals("unknown", product_number);
    }
}
