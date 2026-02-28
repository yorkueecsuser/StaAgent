import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class SpotBugsWarningExampleTest {

    @Test
    public void testShowBug() {
        SpotBugsWarningExample example = new SpotBugsWarningExample();
        List<Integer> result = example.showBug(); // TRIGGER BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
        
        // Intentional failure to demonstrate the bug
        assertNull(result); // This will fail because result is not null
    }
}