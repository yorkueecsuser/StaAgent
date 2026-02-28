import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionToArraySafeParameterBugTest {

    private CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();

    @Test
    public void testToArrayBug() {
        // TRIGGER BUG: CollectionToArraySafeParameter
        Integer[] result = bug.showBug();
        assertEquals(3, result.length); // This assertion should fail because the size of the returned array is 2
    }
}