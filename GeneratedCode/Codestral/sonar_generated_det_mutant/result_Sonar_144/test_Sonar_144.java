import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class SerializationBugTest {
    @Test(expected = IOException.class)
    public void showBugTest() {
        SerializationBug bug = new SerializationBug();
        bug.showBug(); // TRIGGER BUG: "writeObject" argument must implement "Serializable"
    }
}