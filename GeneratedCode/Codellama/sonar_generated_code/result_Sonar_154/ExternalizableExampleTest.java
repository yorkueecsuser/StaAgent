import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableExampleTest {
    @Test
    public void testExternalizableExample() {
        ExternalizableExample example = new ExternalizableExample(1, "John Doe");
        byte[] serialized = example.serialize();
        ExternalizableExample deserialized = example.deserialize(serialized);
        assertEquals(1, deserialized.getId());
        assertEquals("John Doe", deserialized.getName());
    }

    @Test
    public void testExternalizableExampleBug() {
        // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
        ExternalizableExample example = new ExternalizableExample(1, "John Doe");
        byte[] serialized = example.serialize();
        ExternalizableExample deserialized = example.deserialize(serialized);
        assertNotEquals(1, deserialized.getId());
        assertNotEquals("John Doe", deserialized.getName());
    }
}