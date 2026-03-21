import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsReferenceBugDemoTest {

    @Test
    public void testEqualsReferenceBug() {
        EqualsReferenceBugDemo demo = new EqualsReferenceBugDemo("Example");
        assertFalse(demo.showBug(demo)); // TRIGGER BUG: EqualsReference
    }
}