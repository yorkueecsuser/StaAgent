import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayFillDemoTest {

    @Test
    public void testShowBug() {
        ArrayFillDemo demo = new ArrayFillDemo();
        demo.showBug(); // TRIGGER BUG: ArrayFillIncompatibleType
    }
}