import org.junit.Test;
import static org.junit.Assert.*;

public class ChainingConstructorIgnoresParameterTest {
    @Test
    public void testBug() {
        // TRIGGER BUG: ChainingConstructorIgnoresParameter
        ChainingConstructorIgnoresParameter launcher = new ChainingConstructorIgnoresParameter(new Location("Test Target"));
        launcher.showBug(new Location("Test Target"), false);
        // The bug is triggered by passing 'false' as the 'askForConfirmation' parameter to the'showBug' method,
        // which is the same parameter name as one of the caller's parameters in the chained constructor.
        // The bug is not triggered when passing 'true' as the 'askForConfirmation' parameter.
    }
}