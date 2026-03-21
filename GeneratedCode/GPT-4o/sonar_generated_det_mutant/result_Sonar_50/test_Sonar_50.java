import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJConfigurationExampleTest {

    @Test
    public void testShowBug() {
        AssertJConfigurationExample example = new AssertJConfigurationExample();
        boolean result = example.showBug(); // TRIGGER BUG: AssertJ configuration should be applied
        assertFalse("The configuration was not applied correctly, bug triggered.", result);
    }
}