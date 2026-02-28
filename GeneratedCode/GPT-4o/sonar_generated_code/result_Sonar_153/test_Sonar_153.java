import org.junit.Test;
import static org.junit.Assert.*;

public class CustomSerializationExampleTest {

    @Test
    public void testShowBug() {
        CustomSerializationExample example = new CustomSerializationExample("Original Data");
        String result = example.showBug(); // TRIGGER BUG: Custom serialization methods should have required signatures
        assertEquals("Original Data - Custom Write - Custom Read", result); // TRIGGER BUG: Custom serialization methods should have required signatures
    }
}