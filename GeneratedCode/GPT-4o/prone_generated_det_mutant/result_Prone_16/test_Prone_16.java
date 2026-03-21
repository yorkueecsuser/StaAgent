import org.junit.Test;
import static org.junit.Assert.*;

public class MissileLauncherTest {

    @Test
    public void testShowBugWithAskForConfirmationTrue() {
        MissileLauncher launcher = new MissileLauncher("Custom Target");
        String result = launcher.showBug(true); // TRIGGER BUG: ChainingConstructorIgnoresParameter
        assertEquals("Target: DEFAULT_TARGET, Ask For Confirmation: true", result);
    }

    @Test
    public void testShowBugWithAskForConfirmationFalse() {
        MissileLauncher launcher = new MissileLauncher("Custom Target");
        String result = launcher.showBug(false); // TRIGGER BUG: ChainingConstructorIgnoresParameter
        assertEquals("Target: DEFAULT_TARGET, Ask For Confirmation: false", result);
    }
}