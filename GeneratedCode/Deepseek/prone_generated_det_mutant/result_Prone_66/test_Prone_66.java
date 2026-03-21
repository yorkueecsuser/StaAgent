import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Hashtable;

public class HashtableBugDemoTest {
    @Test
    public void testShowBug() {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }
}