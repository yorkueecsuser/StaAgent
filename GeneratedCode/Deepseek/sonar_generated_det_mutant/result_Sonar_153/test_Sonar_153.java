import org.junit.Test;
import static org.junit.Assert.*;

public class SerializableBugTest {
    @Test
    public void testShowBug() {
        SerializableBug bug = new SerializableBug();
        bug.showBug(); // TRIGGER BUG: Custom serialization methods should have required signatures
    }
}