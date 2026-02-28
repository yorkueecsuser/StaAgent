import org.junit.Test;
import static org.junit.Assert.*;

public class GarbageCollectionExampleTest {

    @Test
    public void testShowBug() {
        GarbageCollectionExample gcExample = new GarbageCollectionExample();
        gcExample.showBug(); // TRIGGER BUG: DoNotCallGarbageCollectionExplicitly
    }
}