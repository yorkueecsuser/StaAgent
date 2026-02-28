import org.junit.Test;
import static org.junit.Assert.*;

public class StringBufferExampleTest {

    @Test
    public void testShowBug() {
        StringBufferExample example = new StringBufferExample();
        String result = example.showBug(); // TRIGGER BUG: InsufficientStringBufferDeclaration
        assertEquals("This is a long string that will exceed the default 16 characters", result);
    }
}