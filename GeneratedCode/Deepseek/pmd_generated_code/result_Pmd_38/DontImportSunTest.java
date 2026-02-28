import org.junit.Test;
import static org.junit.Assert.*;

public class DontImportSunTest {
    @Test
    public void testBug() {
        DontImportSun dontImportSun = new DontImportSun();
        dontImportSun.showBug();
    }
}