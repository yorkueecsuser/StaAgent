import org.junit.Test;
import static org.junit.Assert.*;

public class JumbledIncrementerExampleTest {

    @Test
    public void testShowBug() {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        int result = example.showBug(); // TRIGGER BUG: JumbledIncrementer
        assertEquals(200, result); // This assertion will fail due to the bug
    }
}