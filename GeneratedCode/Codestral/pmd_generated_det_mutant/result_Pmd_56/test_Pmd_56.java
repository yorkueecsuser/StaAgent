import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.NotSerializableException;

public class MainClassTest {

    @Test
    public void testMissingSerialVersionUID() throws IOException, ClassNotFoundException {
        try {
            MainClass.showBug(); // TRIGGER BUG: MissingSerialVersionUID
            fail("Expected NotSerializableException to be thrown"); // Test case should fail here
        } catch (NotSerializableException e) {
            // Expected exception
        }
    }
}