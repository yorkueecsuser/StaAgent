import org.junit.Test;
import static org.junit.Assert.*;

public class CovariantArrayBugDemoTest {

    @Test
    public void testShowBug() {
        CovariantArrayBugDemo demo = new CovariantArrayBugDemo();
        demo.showBug(); // TRIGGER BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
    }
}