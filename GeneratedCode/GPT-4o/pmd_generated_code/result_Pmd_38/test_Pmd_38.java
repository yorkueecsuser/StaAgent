import org.junit.Test;
import static org.junit.Assert.*;

public class SunImportExampleTest {

    @Test
    public void testShowBug() {
        SunImportExample example = new SunImportExample();
        String result = example.showBug("Test"); // TRIGGER BUG: DontImportSun
        assertEquals("VGVzdA==", result); // TRIGGER BUG: DontImportSun
    }
}