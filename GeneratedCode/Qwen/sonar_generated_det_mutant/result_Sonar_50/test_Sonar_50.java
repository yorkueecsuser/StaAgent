import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJBugExampleTest {

    @Test
    public void testShowBug() {
        AssertJBugExample example = new AssertJBugExample();
        Object result = example.showBug(); // TRIGGER BUG: AssertJ configuration should be applied
        assertTrue(result instanceof org.assertj.core.configuration.Configuration);
    }
}