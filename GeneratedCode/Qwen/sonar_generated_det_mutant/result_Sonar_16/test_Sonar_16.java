import org.junit.Test;
import static org.junit.Assert.*;

public class ConfigurationExampleTest {

    @Test
    public void testShowBugWithUninitializedField() {
        ConfigurationExample configExample = new ConfigurationExample();
        assertNull(configExample.getOptionalConfig()); // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
        assertEquals(null, configExample.showBug()); // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
    }
}