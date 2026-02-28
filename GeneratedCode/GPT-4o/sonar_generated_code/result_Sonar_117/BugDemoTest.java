import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BugDemoTest {

    @Test
    public void testToStringReturnsNonNull() {
        List<String> emptyList = new ArrayList<>();
        BugDemo demo = new BugDemo(emptyList);
        
        assertNotNull(demo.showBug()); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }

    @Test
    public void testCloneReturnsNonNull() {
        List<String> emptyList = new ArrayList<>();
        BugDemo demo = new BugDemo(emptyList);
        
        assertNotNull(demo.showBugClone()); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }
}