import org.junit.Test;
import static org.junit.Assert.*;

public class UnreachableCodeExampleTest {

    @Test
    public void testUnreachableCode() {
        UnreachableCodeExample example = new UnreachableCodeExample();
        String result = example.showBug(); // TRIGGER BUG: Conditionally executed code should be reachable
        assertEquals("This will never be returned", result); // This assertion will fail, triggering the bug
    }
}