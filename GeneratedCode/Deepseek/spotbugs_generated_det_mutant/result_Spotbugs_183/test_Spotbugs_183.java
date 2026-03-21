import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main = new Main();
        main.showBug();
        // TRIGGER BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)
    }
}