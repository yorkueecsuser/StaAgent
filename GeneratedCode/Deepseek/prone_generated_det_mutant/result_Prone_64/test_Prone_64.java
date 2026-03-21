import org.junit.Test;
import static org.junit.Assert.*;

public class RealPaymentTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: GuiceAssistedParameters
        // This test should fail because it triggers the bug in the constructor
        // with two @Assisted parameters of the same type without named annotations
    }
}