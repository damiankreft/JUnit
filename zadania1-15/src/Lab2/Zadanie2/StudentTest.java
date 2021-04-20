package Lab2.Zadanie2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {
    @Test
    public void when_lastName_isnt_specified_sets_lastName_to_unknown() {
        // Arrange & Act
        var student = new Student();

        // Assert
        assertEquals(student.getFirstName(), "Unknown");
        assertEquals(student.getLastName(), "Unknown");
    }

    @Test
    public void when_firstName_isnt_specified_sets_firstName_to_unknown() {
        // Arrange & Act
        var student = new Student();

        // Assert
        assertEquals("Unknown", student.getFirstName());
    }

    @Test
    public void given_poj_grade_sets_students_attendance() {
        // Arrange
        var student = new Student();
        var grade = 3;

        // Act
        student.setGrade(grade);

        // Assert
        var expected_attendance = (3.0 / 5.0) * 100;
        var delta = 0.1;
        assertEquals(expected_attendance, student.getAttendance(), delta);
    }

    @Test
    public void when_attendance_set_falls_below_50_percent_grade_should_be_equal_2() {
        // Arrange
        var student = new Student();

        // Act
        student.setAttendance(30);

        // Assert
        var expected_grade = 2;
        assertEquals(expected_grade, student.getGrade());
    }
}
