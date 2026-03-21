import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExternalizableClassTest {

    @Test
    public void testShowBug() {
        BuggyExternalizableClass buggyClass = new BuggyExternalizableClass();
        String result = buggyClass.showBug();
        // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
        assertTrue(result.contains("InvalidClassException"));
    }
}