import org.junit.Test;
import static org.junit.Assert.*;

public class ProvidesMethodOutsideModuleExampleTest {

    @Test
    public void testShowBug() {
        ProvidesMethodOutsideModuleExample example = new ProvidesMethodOutsideModuleExample();
        
        String expected = "This is a provided string!";
        String actual = example.showBug(); // TRIGGER BUG: ProvidesMethodOutsideOfModule
        
        assertEquals(expected, actual); // TRIGGER BUG: ProvidesMethodOutsideOfModule
    }
}