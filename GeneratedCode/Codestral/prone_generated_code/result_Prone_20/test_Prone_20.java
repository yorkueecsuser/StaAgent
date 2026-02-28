import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionToArraySafeParameterBugTest {

    @Test
    public void testShowBug() {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug(); // TRIGGER BUG: CollectionToArraySafeParameter
        // The bug is triggered when we try to store Strings into an Object array
    }
}