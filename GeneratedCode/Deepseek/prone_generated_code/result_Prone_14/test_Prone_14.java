import org.junit.Test;
import static org.junit.Assert.*;

public class BoxedPrimitiveEqualityBugTest {
    BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();

    @Test
    public void testShowBug() {
        Integer result = bug.showBug();
        assertNotNull(result); // This test should fail to trigger the bug
    }
}