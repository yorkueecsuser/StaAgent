import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidEnumAsIdentifierExampleTest {

    @Test
    public void testShowBug() {
        AvoidEnumAsIdentifierExample example = new AvoidEnumAsIdentifierExample();
        String result = example.showBug(); // TRIGGER BUG: AvoidEnumAsIdentifier
        assertEquals("foo", result); // This line will not be reached if a compilation error occurs
    }
}