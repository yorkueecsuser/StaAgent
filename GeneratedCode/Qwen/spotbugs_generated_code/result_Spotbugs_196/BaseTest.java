import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationExampleTest {

    @Test
    public void testShowBug() {
        SerializationExample example = new SerializationExample();
        assertEquals("Sample Data", example.showBug()); // TRIGGER BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
    }
}