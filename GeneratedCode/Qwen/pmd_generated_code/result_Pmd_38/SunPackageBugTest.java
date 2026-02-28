import org.junit.Test;
import static org.junit.Assert.*;

public class SunPackageBugTest {

    @Test
    public void testShowBug() {
        SunPackageBug bugDemo = new SunPackageBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: DontImportSun
        assertEquals("SGVsbG8sIFdvcmxkIQ==", result);
    }
}