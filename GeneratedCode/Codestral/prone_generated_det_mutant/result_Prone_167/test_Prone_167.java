import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeBugTest {

    @Test
    public void testShowBug() {
        UnicodeBug bug = new UnicodeBug();
        String code = bug.showBug();
        assertFalse("Access granted"
                + "\u202E" // TRIGGER BUG: UnicodeDirectionalityCharacters
                + " is not equal to "
                + code,
                code.contains("Access granted"));
    }
}