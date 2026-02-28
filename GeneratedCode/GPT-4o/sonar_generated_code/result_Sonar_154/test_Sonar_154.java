import org.junit.Test;
import static org.junit.Assert.*;

public class ExternalizableBugExampleTest {

    @Test
    public void testShowBug() {
        ExternalizableBugExample example = new ExternalizableBugExample("Test Message"); // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
        String result = example.showBug();
        assertEquals("Deserialization would fail without a no-arg constructor", result);
    }
}