import org.junit.Test;
import static org.junit.Assert.*;

public class PathVariableBugExampleTest {

    @Test
    public void testShowBugWithoutPathVariableAnnotation() {
        PathVariableBugExample example = new PathVariableBugExample();
        String result = example.showBug("request", "response", "123"); // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
        assertEquals("Received ID: 123", result); // This assertion will pass, but the bug is still present in the code logic
    }

    @Test
    public void testShowBugWithNullId() {
        PathVariableBugExample example = new PathVariableBugExample();
        String result = example.showBug("request", "response", null); // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
        assertEquals("Received ID: null", result); // This assertion will pass, but the bug is still present in the code logic
    }

    @Test
    public void testShowBugWithEmptyId() {
        PathVariableBugExample example = new PathVariableBugExample();
        String result = example.showBug("request", "response", ""); // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
        assertEquals("Received ID: ", result); // This assertion will pass, but the bug is still present in the code logic
    }
}