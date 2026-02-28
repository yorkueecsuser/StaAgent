import org.junit.Test;
import static org.junit.Assert.*;

public class ClassCastExceptionDemoTest {

    @Test
    public void testShowBug() {
        ClassCastExceptionDemo demo = new ClassCastExceptionDemo();
        Integer[] result = demo.showBug(); // TRIGGER BUG: ClassCastExceptionWithToArray
        assertNotNull(result); // This assertion will not be reached due to the exception
    }
}