import org.assertj.core.configuration.Configuration;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJConfigurationBugTest {

    @Test
    public void testShowBug() {
        AssertJConfigurationBug buggyInstance = new AssertJConfigurationBug();
        Configuration configuration = Configuration.getInstance();
        boolean originalComparingPrivateFields = configuration.isComparingPrivateFields();
        configuration.setComparingPrivateFields(true);

        buggyInstance.showBug();

        // TRIGGER BUG: AssertJ configuration should be applied
        // Bug is triggered here because the configuration is not applied in the showBug method
        assertFalse(configuration.isComparingPrivateFields());

        // Restore original configuration
        configuration.setComparingPrivateFields(originalComparingPrivateFields);
    }
}