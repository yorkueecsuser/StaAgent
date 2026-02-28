import org.junit.Test;
import static org.junit.Assert.*;

public class InjectDemoTest {

    @Test
    public void testShowBug() {
        InjectDemo demo = new InjectDemo(); // TRIGGER BUG: InjectOnMemberAndConstructor
        assertNotNull(demo.showBug());
    }

    @Test
    public void testItemsInitialization() {
        InjectDemo demo = new InjectDemo(); // TRIGGER BUG: InjectOnMemberAndConstructor
        assertEquals(1, demo.showBug().size());
        assertEquals("Default Item", demo.showBug().get(0));
    }
}