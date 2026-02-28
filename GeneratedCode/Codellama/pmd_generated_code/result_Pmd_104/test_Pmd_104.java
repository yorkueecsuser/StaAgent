import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class AvoidInstantiatingObjectsInLoopsTest {
    @Test
    public void testBug() {
        AvoidInstantiatingObjectsInLoops testObject = new AvoidInstantiatingObjectsInLoops();
        testObject.showBug();

        List<String> list = testObject.getList();

        // TRIGGER BUG: AvoidInstantiatingObjectsInLoops
        assertEquals(10, list.size());
    }
}