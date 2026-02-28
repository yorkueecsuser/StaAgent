import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugTest {
    VirtualThreadBug virtualThreadBug = new VirtualThreadBug();

    @Test
    public void testShowBug() {
        virtualThreadBug.showBug(); // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
    }

    @Test
    public void testShowBug2() {
        virtualThreadBug.showBug2(); // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
    }
}