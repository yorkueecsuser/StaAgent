import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationBugTest {

    @Test
    public void testShowBug() {
        SerializationBug bugDemo = new SerializationBug();
        bugDemo.showBug(); // TRIGGER BUG: "writeObject" argument must implement "Serializable"
    }
}