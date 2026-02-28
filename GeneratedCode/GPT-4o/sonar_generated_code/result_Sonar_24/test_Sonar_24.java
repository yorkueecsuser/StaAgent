import org.junit.Test;
import static org.junit.Assert.*;

public class RecordBugDemoTest {

    @Test
    public void testArrayEqualityBug() {
        RecordBugDemo demo = new RecordBugDemo();
        String[] names1 = {"Alice", "Bob"};
        String[] names2 = {"Alice", "Bob"};
        
        // The arrays have the same content, but different references, 
        // so the default equals method will return false.
        boolean result = demo.showBug(names1, 30, names2, 30); // TRIGGER BUG: Equals method should be overridden in records containing array fields

        // This assertion will fail due to the bug in RecordBugDemo.
        assertTrue("The two persons should be considered equal", result); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }
}