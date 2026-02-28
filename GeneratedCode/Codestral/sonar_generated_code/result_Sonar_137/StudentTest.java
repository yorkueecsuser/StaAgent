import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void testStudentIdRetrieval() {
        School school = new School();
        Student john = new Student("John");
        school.addStudent(john, 1);
        Student johnClone = new Student("John");
        // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
        assertNotNull("Student ID should not be null", school.getStudentId(johnClone));
    }
}