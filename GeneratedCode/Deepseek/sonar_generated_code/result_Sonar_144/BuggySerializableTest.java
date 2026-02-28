import org.junit.Test;
import static org.junit.Assert.*;

public class BuggySerializableTest {
    @Test
    public void testShowBug() throws Exception {
        BuggySerializable buggySerializable = new BuggySerializable();
        // TRIGGER BUG: "writeObject" argument must implement "Serializable"
        buggySerializable.showBug(); // This line should trigger the bug
    }
}