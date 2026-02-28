import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientStringBufferingTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: InefficientStringBuffering
        String result = InefficientStringBuffering.showBug();
        // By checking the string, we can see the bug is triggered because an additional buffer is created and destroyed
        assertTrue(result.contains("tmp =") && result.contains(System.getProperty("java.io.tmpdir")));
    }
}