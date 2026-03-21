import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolExampleTest {

    @Test
    public void testShowBug() {
        SchoolExample school = new SchoolExample();
        school.showBug(); // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes

        SchoolExample.Student student1 = new SchoolExample.Student("Alice", 1);
        SchoolExample.Student student2 = new SchoolExample.Student("Alice", 1);

        school.addStudent(student1, 90);
        Integer grade = school.getStudentGrade(student2); // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes

        assertNull("Expected grade to be null due to hashCode issue", grade);
    }
}