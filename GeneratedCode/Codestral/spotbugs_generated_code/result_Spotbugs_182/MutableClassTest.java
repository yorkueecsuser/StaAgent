import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testShowBug() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.addToSet("Item1");
        buggyClass.addToSet("Item2");

        // TRIGGER BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
        buggyClass.showBug().add("Item3"); // This line should fail the test as it modifies the mutable set

        // Assert to check if the bug was triggered
        assertTrue(buggyClass.showBug().contains("Item3"));
    }
}