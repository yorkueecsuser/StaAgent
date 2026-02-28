import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {
    @Test
    // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public void testFinalizeBug() {
        FinalizeBug buggy = new FinalizeBug();
        buggy.finalize(1);
        fail("Expected an UnsupportedOperationException to be thrown");
    }
}