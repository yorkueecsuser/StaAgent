import org.junit.Test;
import static org.junit.Assert.*;

public class MisleadingEscapedSpaceBugTest {
    @Test
    public void testShowBug() {
        MisleadingEscapedSpaceBug bug = new MisleadingEscapedSpaceBug();
        String colors = bug.showBug();
        // TRIGGER BUG: MisleadingEscapedSpace
        assertEquals("one \n    two \n    three\n    ", colors);
    }
}