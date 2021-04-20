package Lab2.Zadanie5.Tests;

import Lab2.Zadanie5.Numbers;
import org.junit.Test;
import org.junit.Assert;

public class NumbersTest {
    private static final double delta = 0.0000001;

    @Test
    public void sums_all_three_variables() {
        var numbers = new Numbers(2, 10, 7);

        Assert.assertEquals(19, numbers.sum());
    }

    @Test
    public void returns_min_value() {
        var numbers = new Numbers(2, 10, 7);

        Assert.assertEquals(2, numbers.min());
    }

    @Test
    public void returns_max_value() {
        var numbers = new Numbers(2, 10, 7);

        Assert.assertEquals(10, numbers.max());
    }

    @Test
    public void returns_mathematical_integer_average_of_a_b_c() {
        var numbers = new Numbers(1, 2, 3);
        var expected = 2;

        Assert.assertEquals(expected, numbers.average(), delta);
    }

    @Test
    public void returns_floating_point_average_of_a_b_c() {
        var numbers = new Numbers(2, 2, 3);
        var expected = 7 / 3;

        Assert.assertEquals(expected, numbers.average(), delta);
    }

    @Test
    public void calculates_geometric_mean() {
        var numbers = new Numbers(5, 5, 5);
        var expected = 5;

        Assert.assertEquals(expected, numbers.geometric(), delta);
    }
}
