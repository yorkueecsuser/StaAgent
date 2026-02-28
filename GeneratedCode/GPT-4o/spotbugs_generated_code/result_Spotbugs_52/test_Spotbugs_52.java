import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnValueIgnoredExampleTest {

    @Test
    public void testShowBug() {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        String result = example.showBug("Date"); // TRIGGER BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)

        // The test is expected to fail because the return value of trim is ignored
        assertEquals("2023-01-01", result.trim());
    }
}