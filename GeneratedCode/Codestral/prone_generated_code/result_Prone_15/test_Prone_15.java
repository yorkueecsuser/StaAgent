import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class BundleBugTest {
    @Test
    public void testShowBug() {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // TRIGGER BUG: BundleDeserializationCast
        // At this point, the test will fail with a ClassCastException
    }
}