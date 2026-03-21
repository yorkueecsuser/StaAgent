import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SerializableSubClassTest {

    @Test
    public void testShowBug() {
        SerializableSubClass instance = new SerializableSubClass(42, 84);

        // TRIGGER BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
        String result = instance.showBug(); 

        // Expecting deserialization to fail due to missing no-arg constructor in the superclass
        assertEquals("Deserialization failed: NonSerializableSuperClass; no valid constructor", result);
    }
}