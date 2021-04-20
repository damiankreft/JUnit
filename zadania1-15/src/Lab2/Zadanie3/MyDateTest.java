package Lab2.Zadanie3;

import org.junit.Assert;
import org.junit.Test;

public class MyDateTest {
    @Test
    public void given_the_fifth_day_of_march_returns_the_date_with_leading_zeros() {
        // Arrange
        var md = new MyDate(5, 3, 2020);

        // Act
        var result = md.getDate();
        var expected = "05/03/2020";

        // Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void given_the_tenth_day_of_december_returns_the_date_with_consisting_of_eight_numbers() {
        // Arrange
        var md = new MyDate(10, 12, 2020);

        // Act
        var result = md.getDate();
        var expected = "10/12/2020";

        // Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void given_day_exceeding_lower_range_does_not_overwrite_default_day() {
        // Arrange
        var day = -1;

        // Act
        var md = new MyDate(day, 0, 0);

        // Assert
        var expected = 1;
        var actual = md.getDay();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void given_day_exceeding_higher_range_does_not_overwrite_default_day() {
        // Arrange
        var day = 32;

        // Act
        var md = new MyDate(day, 0, 0);

        // Assert
        var expected = 1;
        var actual = md.getDay();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void given_month_exceeding_lower_range_does_not_overwrite_default_month() {
        // Arrange
        var month = -1;

        // Act
        var md = new MyDate(0, month, 0);

        // Assert
        var expected = 1;
        var actual = md.getMonth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void given_month_exceeding_higher_range_does_not_overwrite_default_month() {
        // Arrange
        var month = 13;

        // Act
        var md = new MyDate(0, month, 0);

        // Assert
        var expected = 1;
        var actual = md.getMonth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void given_year_exceeding_lower_range_does_not_overwrite_default_year() {
        // Arrange
        var year = 966;

        // Act
        var md = new MyDate(0, 0, year);

        // Assert
        var expected = 1990;
        var actual = md.getYear();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void given_year_exceeding_higher_range_does_not_overwrite_default_year() {
        // Arrange
        var year = 2051;

        // Act
        var md = new MyDate(0, 0, year);

        // Assert
        var expected = 1990;
        var actual = md.getYear();
        Assert.assertEquals(expected, actual);
    }
}
