import org.junit.Test;
import static org.junit.Assert.*;

public class JumbledIncrementerExampleTest {

    @Test
    public void testShowBug() {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug(); // TRIGGER BUG: JumbledIncrementer
        fail("The test should trigger the JumbledIncrementer bug and fail.");
    }
}