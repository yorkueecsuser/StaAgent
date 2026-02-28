import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.ArrayList;

public class CollectionExampleTest {

    @Test
    public void testShowBug() {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug(); // TRIGGER BUG: UseArrayListInsteadOfVector
        assertTrue(result instanceof ArrayList); // This assertion will fail because result is a Vector
    }
}