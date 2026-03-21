import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugExampleTest {

    @Test
    public void testShowBug() {
        VirtualThreadBugExample example = new VirtualThreadBugExample();
        example.showBug(); // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
    }

    @Test
    public void testShowBug1() {
        VirtualThreadBugExample example = new VirtualThreadBugExample();
        example.showBug1(); // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
    }
}