import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayFillBugDemoTest {

    @Test
    public void testShowBug() {
        ArrayFillBugDemo demo = new ArrayFillBugDemo();
        demo.showBug(); // TRIGGER BUG: ArrayFillIncompatibleType
    }
}