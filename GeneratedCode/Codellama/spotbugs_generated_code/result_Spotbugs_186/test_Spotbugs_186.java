import org.junit.Test;
import static org.junit.Assert.*;

class MS_PKGPROTECTTest {
    @Test
    public void testShowBug() {
        MS_PKGPROTECT pkgProtect = new MS_PKGPROTECT();
        pkgProtect.showBug();
        // TRIGGER BUG: MS: Field should be package protected (MS_PKGPROTECT)
        assertEquals(1, pkgProtect.getCounter());
    }
}