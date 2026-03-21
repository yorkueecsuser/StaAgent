import org.junit.Test;
import static org.junit.Assert.*;

public class InterfaceEqualityBugTest {

    @Test
    public void testShowBug() {
        InterfaceEqualityBug.showBug();
        // TRIGGER BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}