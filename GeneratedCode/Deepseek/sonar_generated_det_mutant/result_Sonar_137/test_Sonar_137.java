import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void testShowBug() {
        School school = new School();
        school.showBug();
        assertEquals(1, school.studentBody.size()); // Expected output is 1 because without hashCode() method, it should not be used in hashes.
        // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
    }
}