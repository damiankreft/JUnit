package Lab2.Zadanie5.Tests;

import Lab2.Zadanie5.Numbers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SortTest {
    @Parameterized.Parameter(value = 0)
    public int numberA;
    @Parameterized.Parameter(value = 1)
    public int numberB;
    @Parameterized.Parameter(value = 2)
    public int numberC;
    public int expected[] = { 2, 7, 10 };

    @Parameterized.Parameters(name = "returns_sorted_array_of_abc_fields_values - {index}: ({0}, {1}, {2})")
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][]{
                { 2, 7, 10 },
                { 2, 10, 7 },
                { 7, 2, 10 },
                { 10, 7, 2 },
        });
    }

    @Test
    public void returns_sorted_array_of_abc_fields_values() {
        var numbers = new Numbers(numberA, numberB, numberC);

        Assert.assertArrayEquals( expected, numbers.sort());
    }
}
