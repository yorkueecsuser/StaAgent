import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class SerializableClassTest {
    @Test
    // TRIGGER BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
    public void testShowBug() throws Exception {
        SerializableClass serializableClass = new SerializableClass(10);
        assertThrows(Exception.class, () -> serializableClass.showBug());  // Trigger the bug
    }
}