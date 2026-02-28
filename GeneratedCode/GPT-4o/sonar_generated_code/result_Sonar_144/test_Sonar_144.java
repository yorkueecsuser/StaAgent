import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationBugExampleTest {

    @Test
    public void testShowBug() {
        SerializationBugExample example = new SerializationBugExample();
        example.showBug(); // TRIGGER BUG: "writeObject" argument must implement "Serializable"
    }
}