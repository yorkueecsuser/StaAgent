import org.assertj.core.configuration.Configuration;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJBugTest {
    @Test
    public void testShowBug() {
        AssertJBug buggyClass = new AssertJBug();
        boolean result = buggyClass.showBug();

        // TRIGGER BUG: AssertJ configuration should be applied
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(result);
        // The bug is triggered here, as we're not applying the configuration
        assertEquals(true, configuration.isComparingPrivateFields());
    }
}