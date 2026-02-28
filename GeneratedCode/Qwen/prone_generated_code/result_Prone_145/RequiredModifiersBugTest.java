import org.junit.Test;
import static org.junit.Assert.*;

public class RequiredModifiersBugTest {

    @Test
    public void testMissingPublicModifier() {
        RequiredModifiersBug bugInstance = new RequiredModifiersBug();
        bugInstance.showBug(); // TRIGGER BUG: RequiredModifiers
    }
}