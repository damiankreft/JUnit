/*
Zaimplementuj klasę Student, do przechowywania imienia, nazwiska,
numer indeksu i obecność (wyrażonej w procentach) oceny z POJ (typu int).
Jeżeli podczas tworzenia obiektu nie zostało przekazane imię i nazwisko,
pola powinny być ustawione wartością "Unknown". Dodaj odpowiednie metody set i get do wszystkich pól klasy.
Jeżeli obecnocność jest mniejsza niż 50%, student powinien otrzymać ocenę 2.
Przetestuj program, tworząc trzy różne obiekty klasy Student.

Damian Kreft
*/


package Lab2.Zadanie2;

public class Student {
    private final String UNKNOWN = "Unknown";
    private final double MAX_GRADE = 5.0;
    private final double PERCENT = 100.0;
    private final double ATTENDANCE_MIN = 50;
    private String firstName = UNKNOWN;
    private String lastName = UNKNOWN;
    private String index;
    private int grade;
    private double attendance = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int ocena) {
        this.grade = ocena;

        var grade = ((double)ocena / MAX_GRADE) * PERCENT;
        setAttendance(grade);
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
//        var attendance = getGrade() / MAX_GRADE * PERCENT;
        this.attendance = attendance;

        if (attendance < ATTENDANCE_MIN) {
            grade = 2;
        }
    }

    public Student() { }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, String index) {
        this(firstName, lastName);
        this.index = index;
    }
}
