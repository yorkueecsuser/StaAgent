import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main = new Main();
        // The showBug method is expected to return null, which is a bug according to the rule
        // TRIGGER BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        assertNotNull("Expected showBug to return non-null value", main.showBug());
    }
}