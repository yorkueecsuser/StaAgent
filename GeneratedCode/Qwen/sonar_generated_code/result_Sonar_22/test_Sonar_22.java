import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionBugDemoTest {

    @Test
    public void testShowBug() {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug(); // TRIGGER BUG: Unsupported methods should not be called on some collection implementations
    }
}