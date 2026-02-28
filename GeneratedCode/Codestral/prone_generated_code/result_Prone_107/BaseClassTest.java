import org.junit.Test;
import static org.junit.Assert.*;

public class SubClassTest {
    @Test
    // TRIGGER BUG: MissingSuperCall
    public void testInitialize() {
        SubClass subClass = new SubClass();
        subClass.showBug();
        // Assert that "BaseClass initialize" is printed.
        // Since the super.initialize() is not called in SubClass's initialize method,
        // this assertion will fail, triggering the original bug.
        assertTrue(System.out.out.toString().contains("BaseClass initialize"));
    }
}