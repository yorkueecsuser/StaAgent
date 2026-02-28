import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BuggyConstructorTest {

    @Test
    public void demonstrateBug() {
        BuggyConstructor bc = new SubClass(); // TRIGGER BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
        assertTrue(bc.message.contains("Because it was called from the constructor of the superclass."));
        bc.showBug();
    }
}