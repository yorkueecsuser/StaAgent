import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugTest {

    @Test
    public void testShowBug() {
        VirtualThreadBug buggyObject = new VirtualThreadBug();
        buggyObject.showBug(); // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
    }
}