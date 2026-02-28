import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantFieldInitializerExampleTest {

    @Test
    public void testRedundantFieldInitializer() {
        RedundantFieldInitializerExample example = new RedundantFieldInitializerExample();
        example.showBug(); // TRIGGER BUG: RedundantFieldInitializer

        // The test fails deliberately to demonstrate the redundant field initializers.
        // In practice, this might not throw an exception but is considered as a bug due to redundant code.
        fail("Test should fail to demonstrate redundant initializations."); // TRIGGER BUG: RedundantFieldInitializer
    }
}