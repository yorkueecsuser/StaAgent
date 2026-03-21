import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BugDemoTest {

    @Test // TRIGGER BUG: Cast operations should not trigger a ClassCastException
    public void testShowBug() {
        BugDemo demo = new BugDemo();
        List<Integer> result = demo.showBug();
        assertTrue(result.get(0) == 1); // This line is not supposed to trigger the bug but it does, so the test will fail.
    }
}