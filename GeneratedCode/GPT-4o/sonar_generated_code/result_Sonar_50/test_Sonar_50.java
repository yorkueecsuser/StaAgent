import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJConfigurationExampleTest {
    
    @Test
    public void testShowBug() {
        AssertJConfigurationExample example = new AssertJConfigurationExample();
        example.showBug(); // TRIGGER BUG: AssertJ configuration should be applied
        fail("Expected configuration to be applied, but it was not."); // TRIGGER BUG: AssertJ configuration should be applied
    }
}