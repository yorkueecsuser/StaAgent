import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InvalidClassException;

public class SerializableClassTest {
    @Test
    public void testShowBug() {
        SerializableClass serializableClass = new SerializableClass(1, 2);
        try {
            serializableClass.showBug(); // TRIGGER BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
            fail("Expected an exception to be thrown");
        } catch (IOException | ClassNotFoundException e) {
            assertTrue(e.getCause() instanceof InvalidClassException);
        }
    }
}