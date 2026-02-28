import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void testBug() {
        School school = new School();
        Student s1 = new Student();
        Student s2 = new Student();
        school.studentBody.put(s1, 10);
        assertEquals(10, school.studentBody.get(s2)); // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
    }
}