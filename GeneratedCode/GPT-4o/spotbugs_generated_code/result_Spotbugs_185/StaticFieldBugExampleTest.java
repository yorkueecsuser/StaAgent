import org.junit.Test;
import static org.junit.Assert.*;

public class StaticFieldBugExampleTest {

    @Test
    public void testShowBug() {
        StaticFieldBugExample example = new StaticFieldBugExample();
        String result = example.showBug();

        // The bug is triggered here because the configValue can be mutable
        assertEquals("InitialConfig", result); // TRIGGER BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)
    }
}