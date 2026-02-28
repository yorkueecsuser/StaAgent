import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidInstantiatingObjectsInLoopsTest {

    @Test
    public void testShowBug() {
        AvoidInstantiatingObjectsInLoops.main(null); // TRIGGER BUG: AvoidInstantiatingObjectsInLoops
    }

    @Test
    public void testShowBugInsideMethod() {
        AvoidInstantiatingObjectsInLoops avoidInstantiatingObjectsInLoops = new AvoidInstantiatingObjectsInLoops();
        avoidInstantiatingObjectsInLoops.showBug(); // TRIGGER BUG: AvoidInstantiatingObjectsInLoops
    }
}