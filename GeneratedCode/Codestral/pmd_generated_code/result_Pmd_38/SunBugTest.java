import org.junit.Test;
import static org.junit.Assert.*;

public class SunBugTest {

    @Test
    public void testShowBug() {
        SunBug sunBug = new SunBug();
        sunBug.showBug(); // TRIGGER BUG: DontImportSun
    }
}