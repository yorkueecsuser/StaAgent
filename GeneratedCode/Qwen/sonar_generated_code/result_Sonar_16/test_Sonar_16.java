import org.junit.Test;
import static org.junit.Assert.*;

public class ConfigurationExampleTest {

    @Test
    public void testShowBugWithNullConfigValue() {
        ConfigurationExample example = new ConfigurationExample();
        example.setConfigValue(null); // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
        assertEquals("Default Value", example.showBug());
    }
}