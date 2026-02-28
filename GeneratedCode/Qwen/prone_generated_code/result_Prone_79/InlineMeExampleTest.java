import org.junit.Test;
import static org.junit.Assert.*;

public class InlineMeExampleTest {

    @Test
    public void testAddMethod() {
        InlineMeExample example = new InlineMeExample();
        assertEquals(5, example.showBug(2, 3)); // TRIGGER BUG: InlineMeValidator
    }
}