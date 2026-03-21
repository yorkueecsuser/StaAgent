import org.junit.Test;
import static org.junit.Assert.*;

public class NonSerializableSessionExampleTest {

    @Test
    public void testShowBug() {
        NonSerializableSessionExample example = new NonSerializableSessionExample();
        example.showBug(); // TRIGGER BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    }
}