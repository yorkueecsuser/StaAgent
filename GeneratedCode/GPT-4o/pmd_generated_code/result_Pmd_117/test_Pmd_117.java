import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;

public class CollectionExampleTest {

    @Test
    public void testShowBug() {
        CollectionExample example = new CollectionExample();
        Collection<String> result = example.showBug(); // TRIGGER BUG: UseArrayListInsteadOfVector
        // The following line will cause the test to fail
        // because the test expects a non-synchronized
        // Collection, but it receives a synchronized Vector
        assertFalse(result instanceof java.util.Vector); // TRIGGER BUG: UseArrayListInsteadOfVector
    }
}