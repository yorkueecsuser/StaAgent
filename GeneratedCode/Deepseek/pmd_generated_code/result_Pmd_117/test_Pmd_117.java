import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class BugTestTest {
    BugTest bugTest = new BugTest();

    @Test
    public void testShowBug() {
        Collection actualOutput = bugTest.showBug();  // TRIGGER BUG: UseArrayListInsteadOfVector
        assertTrue(actualOutput instanceof Vector);
    }
}