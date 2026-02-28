import org.junit.Test;
import static org.junit.Assert.*;

public class CloneBugExampleTest {

    @Test
    public void testShowBug() throws CloneNotSupportedException {
        CloneBugExample example = new CloneBugExample("Test Data");
        String result = example.showBug(); // TRIGGER BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        assertEquals("Cloned: Test Data", result); // This will fail due to the bug
    }
}