import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

public class PathVariableBugExampleTest {

    @Test
    public void testShowBugWithoutPathVariableAnnotation() {
        PathVariableBugExample example = new PathVariableBugExample();
        Map<String, String> result = example.showBug("123"); // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
        
        // This assertion is expected to fail because the method signature lacks @PathVariable annotation
        assertEquals("123", result.get("id"));
    }
}