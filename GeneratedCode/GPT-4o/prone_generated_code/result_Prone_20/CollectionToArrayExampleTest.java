import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionToArrayExampleTest {

    @Test
    public void testShowBug() {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug(); // TRIGGER BUG: CollectionToArraySafeParameter
    }
}