import org.junit.Test;
import static org.junit.Assert.*;

public class ExternalizableBugTest {
    @Test
    public void testShowBug() {
        ExternalizableBug.showBug();  // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
    }
}