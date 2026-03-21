import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Optional;

// TRIGGER BUG: "null" should not be used with "Optional"

public class BugInOptionalTest { // OriginalClassName is changed to BugInOptionalTest
    @Test
    public void testShowBug() {
        BugInOptional bugInOptional = new BugInOptional();
        Integer result = bugInOptional.showBug(); // The generated JUNIT test case triggers the bug by calling this method
        assertNotNull(result); // The test should fail here as Optional.ofNullable(null) returns an Optional with null value
    }
}