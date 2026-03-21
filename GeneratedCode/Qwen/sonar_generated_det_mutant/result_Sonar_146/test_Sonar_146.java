import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class CollectionBugDemoTest {

    @Test
    public void testShowBug1() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Object> result = demo.showBug1(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
        assertEquals(2, result.size()); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBug2() {
        CollectionBugDemo demo = new CollectionBugDemo();
        boolean result = demo.showBug2(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
        assertFalse(result); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBug3() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Object> result = demo.showBug3(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
        assertEquals(1, result.size()); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBug4() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Object> result = demo.showBug4(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
        assertEquals(1, result.size()); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBug5() {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Object> result = demo.showBug5(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
        assertEquals(0, result.size()); // This assertion will fail due to the bug
    }
}