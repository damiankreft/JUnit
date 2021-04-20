package Lab2.Zadanie4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockTest {
    @Test
    public void given_seconds_input_matching_boundaries_sets_valid_time() {
        var clock = new Clock(3910);

        assertEquals(1, clock.getHours());
        assertEquals(5, clock.getMinutes());
        assertEquals(10, clock.getSeconds());
    }

    @Test
    public void given_seconds_input_exceeding_boundaries_leaves_time_set_to_default_values() {
        var twenty_four_hours = 86400;
        var clock = new Clock(twenty_four_hours);

        assertEquals(0, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void given_maximum_time_matching_range_sets_maximum_time() {
        var twenty_four_hours_without_a_second = 86399;
        var clock = new Clock(twenty_four_hours_without_a_second);

        assertEquals(23, clock.getHours());
        assertEquals(59, clock.getMinutes());
        assertEquals(59, clock.getSeconds());
    }

    @Test
    public void creates_clock_with_default_time() {
        var clock = new Clock();

        assertEquals(12, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void returns_time_string_with_leading_zeros() {
        var clock = new Clock(12, 2, 0);
        var expected = "[12:02:00]";

        assertEquals(expected, clock.toString());
    }

    @Test
    public void increments_time_on_tick() {
        var clock = new Clock(3599);
        clock.tick();

        assertEquals(1, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void ticking_maximum_time_doesnt_exceed_maximum_time_value() {
        var clock = new Clock(86399);
        clock.tick();

        assertEquals(23, clock.getHours());
        assertEquals(59, clock.getMinutes());
        assertEquals(59, clock.getSeconds());
    }

    @Test
    public void tickingDown_minimal_time_doesnt_exceed_minimal_time_value() {
        var clock = new Clock(0);
        clock.tickDown();

        assertEquals(0, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void decrements_time_on_tickDown() {
        var clock = new Clock(3600);
        clock.tickDown();

        assertEquals(0, clock.getHours());
        assertEquals(59, clock.getMinutes());
        assertEquals(59, clock.getSeconds());
    }
}
