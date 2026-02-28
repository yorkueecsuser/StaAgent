import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectInstantiationInLoopTest {

    @Test
    public void testShowBug() {
        ObjectInstantiationInLoop example = new ObjectInstantiationInLoop();
        int result = example.showBug(10); // TRIGGER BUG: AvoidInstantiatingObjectsInLoops
        assertEquals(100, result); // This assertion will fail, triggering the bug
    }
}