import org.junit.Test;
import static org.junit.Assert.*;

public class SubstringBugTest {

    @Test
    public void testShowBug() {
        SubstringBug bug = new SubstringBug();
        String s = "Hello";
        assertNotEquals(s, bug.showBug(s)); // TRIGGER BUG: SubstringOfZero
    }
}