import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testShowBug() {
        List<String> data = new ArrayList<>();
        data.add("Initial data");
        BuggyClass buggyObject = new BuggyClass(data);

        // External modification to the mutable object
        data.add("External modification");

        // TRIGGER BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
        buggyObject.showBug("New data");

        // The test should fail here as the internal state of the object has been modified externally
        assertEquals(2, buggyObject.getData().size());
        assertTrue(buggyObject.getData().contains("External modification"));
    }
}