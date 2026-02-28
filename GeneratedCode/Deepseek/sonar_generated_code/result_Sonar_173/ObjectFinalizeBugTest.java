import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectFinalizeBugTest {
    private ObjectFinalizeBug bug = new ObjectFinalizeBug();

    @Test
    public void testFinalizeBug() {
        bug.showBug();
        // TRIGGER BUG: The "Object.finalize()" method should not be called
    }
}