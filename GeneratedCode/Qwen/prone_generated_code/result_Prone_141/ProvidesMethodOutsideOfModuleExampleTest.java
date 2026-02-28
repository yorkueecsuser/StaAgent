import org.junit.Test;
import static org.junit.Assert.*;

public class ProvidesMethodOutsideOfModuleExampleTest {

    @Test
    public void testProvideMethodOutsideOfModule() {
        ProvidesMethodOutsideOfModuleExample example = new ProvidesMethodOutsideOfModuleExample();
        assertEquals("Hello, World!", example.showBug()); // TRIGGER BUG: ProvidesMethodOutsideOfModule
    }
}