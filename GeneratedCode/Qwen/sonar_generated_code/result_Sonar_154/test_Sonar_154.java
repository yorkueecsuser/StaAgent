import org.junit.Test;
import static org.junit.Assert.*;

public class ExternalizableExampleTest {

    @Test
    public void testDeserializationFailsWithoutNoArgConstructor() {
        ExternalizableExample example = new ExternalizableExample("Sample Data");
        assertEquals("java.io.InvalidClassException: ExternalizableExample; no valid constructor", example.showBug()); // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
    }
}