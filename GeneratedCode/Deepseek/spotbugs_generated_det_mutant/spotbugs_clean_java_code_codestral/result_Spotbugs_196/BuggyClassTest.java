import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testShowBug() {
        BuggyClass buggyObject = new BuggyClass();
        buggyObject.showBug(); // TRIGGER BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
    }
}