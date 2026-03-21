import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SchoolTest {
    @Test
    public void testGetStudentGrade() {
        School school = new School();
        Student student1 = new Student("John Doe", 1);
        Student student2 = new Student("John Doe", 1);
        school.addStudent(student1, 10);
        // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
        assertEquals(Integer.valueOf(10), school.getStudentGrade(student2));
    }

    @Test
    public void testShowBug() {
        School school = new School();
        school.showBug();
    }
}