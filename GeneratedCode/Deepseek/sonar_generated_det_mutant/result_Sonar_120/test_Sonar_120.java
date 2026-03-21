import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        // Create an instance of Main
        Main main = new Main();

        // Create an instance of Collection
        Collection<String> collection = new ArrayList<>();

        // Add elements to collection
        collection.add("element");

        // Call showBug method
        main.showBug("command", collection);

        // TRIGGER BUG: Return values from functions without side effects should not be ignored
        fail("This test case should fail as the bug in the original code is not fixed.");
    }
}