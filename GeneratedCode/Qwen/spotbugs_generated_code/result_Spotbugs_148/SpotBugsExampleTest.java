import org.junit.Test;
import static org.junit.Assert.*;

public class SpotBugsExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        SpotBugsExample example = new SpotBugsExample();
        example.showBug(null); // TRIGGER BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)  
    }
}