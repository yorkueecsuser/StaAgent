import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void testShowBugWithExistingStudent() {
        School school = new School();
        Integer result = school.showBug("Alice");
        assertEquals("Expected to retrieve the student 'Alice', but failed.", (Integer) 1, result);
        // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
    }

    @Test
    public void testShowBugWithNonExistingStudent() {
        School school = new School();
        Integer result = school.showBug("Charlie");
        assertNull("Expected 'Charlie' not to be found, but it was.", result);
        // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
    }

    @Test
    public void testShowBugWithLogicEqualStudent() {
        School school = new School();
        Integer result = school.showBug("Bob");
        assertEquals("Expected to retrieve the student 'Bob', but failed.", (Integer) 2, result);
        // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
    }
}