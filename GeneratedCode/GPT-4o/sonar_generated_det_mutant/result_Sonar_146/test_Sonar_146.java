import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class CollectionBugDemonstrationTest {

    @Test
    public void testShowBug() {
        CollectionBugDemonstration demo = new CollectionBugDemonstration();
        
        List<Object> objs = demo.showBug(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods

        // Check if the first element is "Hello"
        assertEquals("Hello", objs.get(0));
        
        // These asserts should fail, indicating the triggered bug
        assertTrue(objs.contains(objs)); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
        assertTrue(objs.isEmpty()); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
    }
}