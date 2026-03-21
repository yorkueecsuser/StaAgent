import org.junit.Test;
import static org.junit.Assert.*;

public class ConfigurationTest {

    @Test
    public void testMaxConnectionsCanBeModified() {
        Configuration config = new Configuration();
        assertEquals(100, config.showBug()); // Initial value check

        config.modifyMaxConnections(200); // TRIGGER BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL) 
        assertEquals(200, config.showBug()); // This assertion will pass, demonstrating the bug
    }
}