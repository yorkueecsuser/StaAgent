import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
    public void testShowBug() {
        School school = new School();
        assertFalse(school.showBug()); // This should fail because the bug is triggered
    }
}