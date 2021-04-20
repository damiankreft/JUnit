/*
Zaimplementuj klasę Clock. Klasa zawierać będzie pola: hours, minutes, seconds.
Zmienna hours przyjmuje wartości z zakresu 0-23, minutes z zakresu 0-59, seconds 0-59.

Dodaj trzy konstruktor:
domyślny - inicjalizuje godzinę 12:00:00;
konstruktor zawierający trzy parametry: hours, minutes, seconds,
konstruktor z jednym parametrem - czas w sekundach licząc od północy jest konwertowany do pól: hours, minutes, seconds.

Dodaj metody:
getHours(), getMinutes(), getSeconds(), bez parametrów, które zwracają odpowiednie wartości;
setHours(), setMinutes(), setSeconds(), z jednym parametrem, który ustawia odpowiednie wartości;
tick(), bez parametrów, która inkrementuje wartość second o jeden. Przykład: wartość 00:00:01 zamieni się na 00:00:02; wartość 00:59:59 zmieni się na 01:00:00;
tickDown(), zmniejsza wartość sekund o jedno; analogiczna do tick();
toString(), bez parametrów, zwraca reprezentację obiektu w postaci "[hh-mm-ss]", uzupełnioną o nieznaczące zera, na przykład: "[03:12:56]". Przetestuj zaimplementowany program.

Damian Kreft
*/


package Lab2.Zadanie4;

public class Clock {
    private static final int LAST_SINGLE_DIGIT_NUMBER = 9;
    private final int SECONDS_IN_HOUR = 3_600;
    private final int SECONDS_IN_MINUTE = 60;
    private final int MINUTES_IN_HOUR = 60;
    private final int day_in_seconds = 86_400;
    private final int HOURS_MAX = 23;
    private final int HOURS_MIN = 0;
    private final int MINUTES_MAX = 59;
    private final int MINUTES_MIN = 0;
    private final int SECONDS_MAX = 59;
    private final int SECONDS_MIN = 0;
    private final int DEFAULT_TIME = 43_200;
    private final int TICK_VALUE = 1;

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours <= HOURS_MAX && hours >= HOURS_MIN)
        {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes <= MINUTES_MAX && minutes >= MINUTES_MIN)
        {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds <= SECONDS_MAX && seconds >= SECONDS_MIN)
        {
            this.seconds = seconds;
        }
    }

    public Clock() {
        setTime(DEFAULT_TIME);
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int seconds) {
        if (seconds < SECONDS_MIN || seconds >= day_in_seconds) {
            // Log OutOfRange value
            return;
        }

        setTime(seconds);
    }

    private int getTime() {
        return hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
    }

    private void setTime(int seconds) {
        hours = seconds / SECONDS_IN_HOUR;
        minutes = (seconds - hours * SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
        this.seconds = (seconds - hours * SECONDS_IN_HOUR) - (minutes * SECONDS_IN_MINUTE);
    }

    public void tick() {
        var newTime = getTime() + TICK_VALUE;

        if (newTime < SECONDS_MIN || newTime >= day_in_seconds) {
            // Log OutOfRange value
            return;
        }
        setTime(newTime);
    }

    public void tickDown() {
        var newTime = getTime() - TICK_VALUE;
        if (newTime >= SECONDS_MIN) {
            setTime(newTime);
        }
    }

    public String toString() {
        var hour = GetTimeWithLeadingZeros(getHours());
        var minute = GetTimeWithLeadingZeros(getMinutes());
        var second = GetTimeWithLeadingZeros(getSeconds());
        return String.format("[%s:%s:%s]", hour, minute, second);
    }

    public static String GetTimeWithLeadingZeros(int time) {
        if (time <= LAST_SINGLE_DIGIT_NUMBER) {
            return "0" + time;
        }

        return time + "";
    }
}
