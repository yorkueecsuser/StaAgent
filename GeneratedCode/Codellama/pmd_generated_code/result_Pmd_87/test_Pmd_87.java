import org.junit.Test;
import static org.junit.Assert.*;

public class UseProperClassLoaderTest {
    @Test
    public void testBug() {
        UseProperClassLoader upl = new UseProperClassLoader();
        try {
            // TRIGGER BUG: UseProperClassLoader
            upl.main(new String[0]);
        } catch (Exception e) {
            fail("Bug triggered: " + e.getMessage());
        }
    }
}