import org.junit.Test;
import static org.junit.Assert.*;

public class MissileLauncherTest {

    @Test
    public void testMissileLauncherWithBoolean() {
        MissileLauncher launcher = new MissileLauncher(true);
        assertEquals("Target: Location{coordinates='0,0'}, Ask for Confirmation: false", launcher.showBug()); // TRIGGER BUG: ChainingConstructorIgnoresParameter
    }
}