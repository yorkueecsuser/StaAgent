import org.junit.Test;
import static org.junit.Assert.*;

public class MS_FINAL_PKGPROTECTTest {

    @Test
    public void testCountIncrement() {
        MS_FINAL_PKGPROTECT.count = 0;
        MS_FINAL_PKGPROTECT.showBug();
        assertEquals(10, MS_FINAL_PKGPROTECT.count);
    }

    @Test
    public void testCountDecrement() {
        MS_FINAL_PKGPROTECT.count = 10;
        MS_FINAL_PKGPROTECT.showBug();
        assertEquals(0, MS_FINAL_PKGPROTECT.count);
    }
}