import org.junit.Test;
import static org.junit.Assert.*;

public class MissileLauncherTest {

    @Test
    public void testConstructorWithBooleanParameter() {
        MissileLauncher ml = new MissileLauncher(true);
        // TRIGGER BUG: ChainingConstructorIgnoresParameter
        // The bug is triggered because the constructor should be calling this(TEST_TARGET, askForConfirmation) instead of this(TEST_TARGET, false)
        assertTrue("Bug was not triggered", ml.askForConfirmation);
    }
}