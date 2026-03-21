import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionBugExampleTest {

    @Test
    public void testShowBug() {
        CollectionBugExample example = new CollectionBugExample();
        example.showBug(); // TRIGGER BUG: Unsupported methods should not be called on some collection implementations
    }
}