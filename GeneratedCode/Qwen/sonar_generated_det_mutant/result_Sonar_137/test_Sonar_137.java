import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void testShowBug() {
        School school = new School();
        school.showBug(); // TRIGGER BUG: Classes that don't define "hashCode()" should not be used in hashes
    }
}