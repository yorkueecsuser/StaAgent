import org.junit.Test;
import static org.junit.Assert.*;

public class ExternalizableExampleTest {

    @Test
    public void testBuggyExternalizableClass() {
        ExternalizableExample example = new ExternalizableExample();
        assertEquals(42, example.showBug()); // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
    }

    @Test
    public void testWorkingExternalizableClass() {
        ExternalizableExample example = new ExternalizableExample();
        assertEquals(42, example.showWorkingExample());
    }
}