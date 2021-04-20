/*
Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year (type int).
Klasa powinna zawierać konstruktor, który inicjalizuje zmienne,
sprawdzając poprawność zakresów (day 0-31, month 0-12, year 1990-2050).
Zaimplementuj methody set i get dla wszystkich pól. Dodaj metodę displayDate,
która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone znakiem "/", np 21/03/2051.
Przetestuj zaimplementowaną klasę.

Damian Kreft
*/



package Lab2.Zadanie3;

public class MyDate {
    private int month = 1;
    private int day = 1;
    private int year = 1990;
    private final int YEAR_MIN = 1990;
    private final int YEAR_MAX = 2050;


    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 0 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 0 && day <= 31) {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= YEAR_MIN && year <= YEAR_MAX) {
            this.year = year;
        }
    }

    public void displayDate() {
        System.out.println(getDate("/"));
    }

    public String getDate() {
        String delimeter = "/";
        var dayWithLeadingZero = addLeadingZeros(day);
        var monthWithLeadingZero = addLeadingZeros(month);
        var stringBuilder = new StringBuilder();
        stringBuilder.append(dayWithLeadingZero);
        stringBuilder.append(delimeter);
        stringBuilder.append(monthWithLeadingZero);
        stringBuilder.append(delimeter);
        stringBuilder.append(year);
        return stringBuilder.toString();
    }

    public String getDate(String delimeter) {
        var dayWithLeadingZero = addLeadingZeros(day);
        var monthWithLeadingZero = addLeadingZeros(month);
        var stringBuilder = new StringBuilder();
        stringBuilder.append(dayWithLeadingZero);
        stringBuilder.append(delimeter);
        stringBuilder.append(monthWithLeadingZero);
        stringBuilder.append(delimeter);
        stringBuilder.append(year);
        return stringBuilder.toString();
    }

    private String addLeadingZeros(int input) {
        return input < 10 ? "0" + input : input + "";
    }
}
